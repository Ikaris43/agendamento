package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class PlanoDeSaudeDAO {
    
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
    
    public static ArrayList<PlanoDeSaude> getPlanosDeSaude () {
        return planosDeSaude;
    }
    
    public static DefaultTableModel getPlanosDeSaudeModel () {
        
        String[] titulos = {"Código", "Operadora", "Número", "Categoria", "Validade"};
        String[][] dados = new String[planosDeSaude.size()][5];
        
        int i = 0;
        for (PlanoDeSaude e : planosDeSaude) {
            dados[i][0] = e.getCodigo().toString();
            dados[i][1] = e.getOperadora();
            dados[i][2] = e.getNumero();
            dados[i][3] = e.getCategoria();
            dados[i][4] = e.getValidade().toString();
            i++;
            
        }
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        return model;
    }
    
    public static PlanoDeSaude getPlanoDeSaude(Integer plano) {
        for(PlanoDeSaude e : planosDeSaude) {
            if (plano == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }
    
       public static void excluir(Integer codigo) {
        for(PlanoDeSaude e : planosDeSaude ) {
         if (codigo == e.getCodigo()) {
            planosDeSaude.remove(e);
            break;
         }
            
    }
    }
       
       public static void gravar(PlanoDeSaude e) {
        planosDeSaude.add(e);
    }
       
    public static void atualizar (PlanoDeSaude correta){
        for (PlanoDeSaude e : planosDeSaude ) {
            if (correta.getCodigo() == e.getCodigo()){
                int posicao = planosDeSaude.indexOf(e);
                planosDeSaude.set(posicao, correta);
                
            }
        }
    }
    
    public static void criarListaDePlanosDeSaude(){
        PlanoDeSaude e1 = new PlanoDeSaude("Claro1", "Gold1", "A-150",LocalDate.of(2022, 10, 25));
        PlanoDeSaude e2 = new PlanoDeSaude("Claro2", "Gold2", "A-151",LocalDate.of(2022, 10, 25));
        PlanoDeSaude e3 = new PlanoDeSaude("Claro3", "Gold3", "A-152",LocalDate.of(2022, 10, 25));
        PlanoDeSaude e4 = new PlanoDeSaude("Claro4", "Gold4", "A-153",LocalDate.of(2022, 10, 25));
        
        
        planosDeSaude.add(e1);
        planosDeSaude.add(e2);
        planosDeSaude.add(e3);
        planosDeSaude.add(e4);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
