package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDAO {
    
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
    
    public static ArrayList<PlanoDeSaude> getPlanosDeSaude () {
        return planosDeSaude;
    }
    
    public static DefaultTableModel getPlanosDeSaudeModel () {
        
        String[] titulos = {"Quantidade", "Operadora", "Número", "Validade"};
        String[][] dados = new String[planosDeSaude.size()][4];
        
        int i = 0;
        for (PlanoDeSaude e : planosDeSaude) {
            dados[i][0] = e.getQuantidade().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getNumero();
            dados[i][3] = e.getValidade().toString();
            i++;
            
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }
    
    public static void criarListaDePlanosDeSaude(){
        PlanoDeSaude e1 = new PlanoDeSaude("Claro1", "Gold1", "150");
        PlanoDeSaude e2 = new PlanoDeSaude("Claro2", "Gold2", "151");
        PlanoDeSaude e3 = new PlanoDeSaude("Claro3", "Gold3", "152");
        PlanoDeSaude e4 = new PlanoDeSaude("Claro4", "Gold4", "153");
        
        planosDeSaude.add(e1);
        planosDeSaude.add(e2);
        planosDeSaude.add(e3);
        planosDeSaude.add(e4);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
