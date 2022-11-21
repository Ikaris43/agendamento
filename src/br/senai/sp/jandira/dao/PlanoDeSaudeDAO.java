package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;

public class PlanoDeSaudeDAO {

    private static final String URL = "C:\\Users\\22282204\\Java\\planoDeSaude.txt";
    private static final Path PATH = Paths.get(URL);

    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
    

    

    public static ArrayList<PlanoDeSaude> getPlanosDeSaude() {
        return planosDeSaude;
    }

    public static DefaultTableModel getPlanosDeSaudeModel() {

        String[] titulos = {"Código", "Operadora", "Número", "Categoria", "Validade"};
        String[][] dados = new String[planosDeSaude.size()][5];

        int i = 0;
        for (PlanoDeSaude e : planosDeSaude) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getNumero();
            dados[i][3] = e.getCategoria();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[i][4] = e.getValidade().format(formato);
            i++;

        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer plano) {
        for (PlanoDeSaude e : planosDeSaude) {
            if (plano == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }

    public static void excluir(Integer codigo) {
        for (PlanoDeSaude e : planosDeSaude) {
            if (codigo == e.getCodigo()) {
                planosDeSaude.remove(e);
                break;
            }

        }
    }

    public static void gravar(PlanoDeSaude e) {
        planosDeSaude.add(e);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            escritor.write(e.getPlanoDeSaudeFormatadoComPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void atualizar(PlanoDeSaude correta) {
        for (PlanoDeSaude e : planosDeSaude) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = planosDeSaude.indexOf(e);
                planosDeSaude.set(posicao, correta);

            }
        }
    }

    public static void criarListaDePlanosDeSaude() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                String[] vetor = linha.split(";");

                String[] dataCortada = vetor[4].split("-");
                String dia = dataCortada[2];
                String mes = dataCortada[1];
                String ano = dataCortada[0];

                String dataFormatada = dia + "/" + mes + "/" + ano;

                

                PlanoDeSaude e = new PlanoDeSaude(
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        LocalDate.EPOCH,
                        Integer.valueOf(vetor[0]));

                planosDeSaude.add(e);

                linha = leitor.readLine();

                
            }
            leitor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro 3!");
        }

    }

    
    
}
