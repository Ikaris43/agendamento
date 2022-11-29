
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.ui.EspecialidadesPanel;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MedicoDAO {
    
    private static final String URL = "C:\\Users\\22282204\\Java\\medico.txt";
    private static final Path PATH = Paths.get(URL);
    
    private static ArrayList<Medico> medicos = new ArrayList<>();
    private static ArrayList<Especialidade> lista = new ArrayList<>();
    private static Especialidade[] especialidades;

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }
    

    public static DefaultTableModel getMedicoModel () {
        
        String[] titulosMedico = {"Código", "Crm", "Nome Do Médico", "Telefone"};
        String[][] dadosMedico = new String[medicos.size()][4];
        
        int i = 0;
        for (Medico e : medicos) {
            dadosMedico[i][0] = e.getCodigo().toString();
            dadosMedico[i][1] = e.getCrm();
            dadosMedico[i][2] = e.getNome();
            dadosMedico[i][3] = e.getTelefone();
            i++;
    
        }
        DefaultTableModel model = new DefaultTableModel(dadosMedico, titulosMedico);
        return model;
    }

    public static void gravar(Medico e) {
       medicos.add(e);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(PATH, StandardOpenOption.APPEND, StandardOpenOption.WRITE);

            escritor.write(e.getMedicoFormatadoComPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

    public static void criarListaDeMedicos() {
       
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {

                String[] vetor = linha.split(";");

                Medico e = new Medico(vetor[1], vetor[2], vetor[4], Integer.valueOf(vetor[0]));

                

                medicos.add(e);

                linha = leitor.readLine();

                
            }
            leitor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Erro 3!");
        }
        
    }
    
}
    





