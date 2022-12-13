package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282204\\Java\\especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282204\\Java\\especialidade-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static DefaultTableModel getEspecialidadesModel() {

        String[] titulos = {"Código", "Nome da Especialidade", "Descrição"};
        String[][] dados = new String[especialidades.size()][3];

        int i = 0;
        for (Especialidade e : especialidades) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getNome();
            dados[i][2] = e.getDescricao();
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }

    public static Especialidade getEspecialidade(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }

    public static void excluir(Integer codigo) {

        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        atualizarArquivo();
    }

    private static void atualizarArquivo() {
        //PASSO 1 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            // Criar o arquivo temporário
            arquivoTemp.createNewFile();

            // Abrir o arquivo temporário para escrita 
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            // Iterar na lista para adicionar as especialidades
            // no arquivo temporário, exceto o registro que 
            // não queremos mais
            
            for (Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();
            
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void atualizar(Especialidade correta) {
        for (Especialidade e : especialidades) {
            if (correta.getCodigo() == e.getCodigo()) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);

            }
        }
        atualizarArquivo();
    }

    public static void gravar(Especialidade e) {
        especialidades.add(e);

        //Gravar em arquivo
        //Decompor um Objeto em String - Serialização
        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }

    }
    
    public static DefaultListModel<Especialidade> getListaDeEspecialidades() {
        DefaultListModel<Especialidade> listaDeEspecialidades = new DefaultListModel<>();
        for(Especialidade i: getEspecialidades()) {
            listaDeEspecialidades.addElement(i);
            listaDeEspecialidades.toString();
        }
        return listaDeEspecialidades;
    }

    //Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidaddes() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Transformar os dados da linha em uma especialidade

                String[] vetor = linha.split(";");

                Especialidade e = new Especialidade(
                        vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));

                //Guardar a especialidade na lista
                especialidades.add(e);

                //Ler a próxima linha
                linha = leitor.readLine();

                
            }
            leitor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro 2");
        }

    }

}
