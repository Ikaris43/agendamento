package br.senai.sp.jandira.testes;

import java.util.ArrayList;
import java.util.Iterator;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

    public static void main(String[] args) {

        Especialidade e1 = new Especialidade("");
        e1.setNome("Cardiologia");
        e1.setDescricao("Não deixa ter um ataque");

        Especialidade e2 = new Especialidade("");
        e2.setNome("Gastroenterologia");
        e2.setDescricao("Não deixa ficar com dor de barriga");

        Especialidade e3 = new Especialidade();
        e3.setNome("Qualquer coisa!!");
        
        Especialidade e4 = new Especialidade();
        e4.setNome("Mania");

        ArrayList<Especialidade> especialidades = new ArrayList<>();
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        System.out.println(especialidades.size());

        int i = 0;

        while (i < especialidades.size()) {

            System.out.println(especialidades.get(i).getNome());
            i++;

        }

        //Usar o For para iteração(repetição)
//		for(contador;condição;acumulador) {
//	}
        for (Especialidade e : especialidades) {
            System.out.println(e.getNome());
        }

//		Criar 3 planos de saude, armazenar em um arraylist e exibir o nome da operadora de cada um deles
        PlanoDeSaude ruby = new PlanoDeSaude("Amil");
        PlanoDeSaude saphire = new PlanoDeSaude("Bradesco");
        PlanoDeSaude pearl = new PlanoDeSaude("Notredame");

        ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();
        planosDeSaude.add(pearl);
        planosDeSaude.add(ruby);
        planosDeSaude.add(saphire);

        System.out.println("----------FOR EACH Plano De Saude------------");
        for (PlanoDeSaude batata : planosDeSaude) {
            System.out.println(batata.getOperadora());
            System.out.println(PlanoDeSaude.getQuantidade());
        }

        PlanoDeSaude ruby2 = new PlanoDeSaude();
        PlanoDeSaude ruby3 = new PlanoDeSaude();
        PlanoDeSaude ruby4 = new PlanoDeSaude();

//        AgendaApp.main(args);

        System.out.println("---" + PlanoDeSaude.getQuantidade());
        System.out.println("total= " + Especialidade.getContador());
        System.out.println(e1.getCodigo()+ " - " + e1.getNome());
        System.out.println(e2.getCodigo()+ " - " + e2.getNome());
        System.out.println(e3.getCodigo()+ " - " + e3.getNome());
        System.out.println(e4.getCodigo()+ " - " + e4.getNome());
        

    }

}
