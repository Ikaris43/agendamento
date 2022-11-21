
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class MedicoDAO {
    
    private static ArrayList<Medico> medicos = new ArrayList<>();

    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }
    

    public static DefaultTableModel getMedicoModel () {
        
        String[] titulosMedico = {"Código", "Crm", "Nome Do Médico", "Telefone"};
        String[][] dadosMedico = new String[medicos.size()][4];
        
        int i = 0;
        for (Medico e : medicos) {
            dadosMedico[i][0] = e.getEmail();
            dadosMedico[i][1] = e.getCrm();
            dadosMedico[i][2] = e.getNome();
            dadosMedico[i][3] = e.getTelefone();
            i++;
    
        }
        DefaultTableModel model = new DefaultTableModel(dadosMedico, titulosMedico);
        return model;
    }
    
}
    





