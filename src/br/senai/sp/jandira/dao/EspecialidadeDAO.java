
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;


public class EspecialidadeDAO {
    
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(Integer codigo) {
        for(Especialidade e : especialidades) {
            if (codigo == e.getCodigo()) {
                return e;
            }
        }
        return null;
    }
    
    public static void excluir(Integer codigo) {
        for(Especialidade e : especialidades ) {
         if (codigo != e.getCodigo()) {
            especialidades.remove(e);
         }
            break;
    }
    }
    
    public static void atualizar (Especialidade correta){
        for (Especialidade e : especialidades ) {
            if (correta.getCodigo() == e.getCodigo()){
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);
            }
        }
    }
    
    public static void gravar(Especialidade e) {
        especialidades.add(e);
    }
    
    //Criar uma lista inicial de especialidades
    public static void criarListaDeEspecialidaddes(){
        Especialidade e1 = new Especialidade("Geral", "Generalizando");
        Especialidade e2 = new Especialidade("Geral2", "Generalizando2");
        Especialidade e3 = new Especialidade("Geral3", "Generalizando3");
        Especialidade e4 = new Especialidade("Geral4", "Generalizando4");
        
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
    }
    
}
