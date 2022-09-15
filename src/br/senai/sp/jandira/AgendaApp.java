package br.senai.sp.jandira;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Especialidade;

public class AgendaApp {

	public static void main(String[] args) {
		

		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		
		Especialidade especialidadeDois = new Especialidade();
		especialidadeDois.setNome("ot");
		
		JOptionPane.showMessageDialog(null, especialidade.getNome());
		System.out.println(especialidade.getNome());
		
		Especialidade descricao = new Especialidade();
		descricao.setDescricao("A Cardiologia é uma ciência que estuda o coração e seu funcionamento!");
		
		JOptionPane.showMessageDialog(null, descricao.getDescricao());
	}

}
