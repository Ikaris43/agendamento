package br.senai.sp.jandira.testes;

import java.lang.reflect.Array;
import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrappers {

    public static void main(String[] args) {

        Integer b = 5;

        Double a = 2.9;
        
        ArrayList<Especialidade> especialidades = new ArrayList<>();

        Especialidade e1 = new Especialidade("");
        e1.setNome("Cardiologia");
        e1.setDescricao("Não deixa ter um ataque");

        Especialidade e2 = new Especialidade("");
        e2.setNome("Gastroenterologia");
        e2.setDescricao("Não deixa ficar com dor de barriga");

        especialidades.add(e1);
        especialidades.add(e2);

        Especialidade e3 = new Especialidade("");
        e3.setNome("Fisioterapia");
        e3.setDescricao("Não deixa ficar com dor nas costas");

        especialidades.add(e3);

        Especialidade e4 = new Especialidade("");
        e4.setNome("Clinico geral");
        e4.setDescricao("Sabe de tudo um pouco e um pouco de tudo!");

//		Especialidade[] especialiades = {e1, e2, e3, e4};
        Especialidade e5 = new Especialidade("");
        e5.setNome("Pediatria");
        e5.setDescricao("Sabe cuidar das criancinhas!");

        especialidades.add(e4);
        especialidades.add(e5);

        System.out.println(especialidades.size());

        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(50);
        System.out.println(notas.size());

        notas.add(15);
        notas.add(0);
        notas.add(65);

        System.out.println(notas.size());

        System.out.println(especialidades.get(3).getNome());

        especialidades.get(1).setNome("teste");
        System.out.println(especialidades.get(1).getNome());

        Especialidade x = new Especialidade("Psicologia", "Ajuda no consciente");

    }

}
