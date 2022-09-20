package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

	public static void main(String[] args) {
		
		
		Especialidade especialidade = new Especialidade();
		especialidade.setNome("Cardiologia");
		especialidade.setDescricao("Mexe com o coração");
		
		Especialidade especialidadeDois = new Especialidade();
		especialidadeDois.setNome("Otorrinolaringologia");
		especialidadeDois.setDescricao("Cuidado do ouvido, garganta...");

		Especialidade especialidadeTres = new Especialidade();
		especialidadeTres.setNome("Gastroenterologia");
		especialidadeTres.setDescricao("Mexe com o sistema gastroentestinal");
		
		Especialidade especialidadeQuatro = new Especialidade();
		especialidadeQuatro.setNome("Fisioterapia");
		especialidadeQuatro.setDescricao("Reabilitação de membros danificados por traumas");
		
		Especialidade especialidadeCinco = new Especialidade();
		especialidadeCinco.setNome("Clínico Geral");
		especialidadeCinco.setDescricao("Aborda o quadro geral da saude");
		
		Especialidade[] especialidadesDoMedico1 = {
				especialidade,
				especialidadeCinco
				};
		
		Medico medico1 = new Medico();
		medico1.setNome("Diogo");
		medico1.setTelefone("11 945426819");
		medico1.setEmail("vieirasantiagom@gmail.com");
		medico1.setCrm("5508-5");
		medico1.setEspecialidade(especialidadesDoMedico1);
		
//		System.out.println(especialidadesDoMedico1[1].getNome());
//		System.out.println(especialidadesDoMedico1[1].getDescricao());
		
		Especialidade[] especialidadesDoMedico2 = {
				especialidadeQuatro,
				especialidade,
				especialidadeCinco
				};
		
		Medico medico2 = new Medico();
		medico2.setNome("Manoel");
		medico2.setTelefone("11 955846215");
		medico2.setEmail("armaen@gmail.com");
		medico2.setCrm("1054-6");
		medico2.setEspecialidade(especialidadesDoMedico2);
		
//		Exibir os dados dos dois médicos
		
		System.out.println("------Lista de Médicos-----");
		System.out.println("Nome do médico: " + medico1.getNome());
		System.out.println("CRM do médico: " + medico1.getCrm());
		System.out.println("Especialidades: ");
		
	int i = 0;
//		while (i < especialidadesDoMedico1.length) {
		while (i < medico1.getEspecialidade().length) {
//			System.out.println("Especialidades: " + especialidadesDoMedico1[i].getNome());
			System.out.print(medico1.getEspecialidade()[i].getNome() + ", ");
			i++;
		}
		
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("Nome do médico: " + medico2.getNome());
		System.out.println("CRM do médico: " + medico2.getCrm());
		System.out.println("Especialidades: ");
		
		i = 0;
		while (i < medico2.getEspecialidade().length) {
//			System.out.println("Especialidades: " + especialidadesDoMedico1[i].getNome());
			System.out.println(medico2.getEspecialidade()[i].getNome() + " ");
			i++;
		}
		
//		Criar dois endereços
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua José Ubeda Martins");
		endereco.setNumero("91");
		endereco.setBairro("Novo Osasco");
		endereco.setCidade("Osasco");
		endereco.setEstado("São Paulo");
		endereco.setCep("06142-230");
		endereco.setComplemento("Casa 1");
		
		Endereco endereco2 = new Endereco();
		endereco2.setLogradouro("Rua Vicente");
		endereco2.setNumero("111");
		endereco2.setBairro("Novo Horizonte");
		endereco2.setCidade("Jandira");
		endereco2.setEstado("São Paulo");
		endereco2.setCep("06502-250");
		endereco2.setComplemento("Senai Jandira");
		
//		Criar dois planos de saude
		
		PlanoDeSaude planoGold = new PlanoDeSaude();
		planoGold.setCategoria("Ouro");
		planoGold.setNumero("10-10");
		planoGold.setOperadora("Unimed");
		planoGold.setValidade(LocalDate.of(2025, 12, 31));

		PlanoDeSaude planoPlatinum = new PlanoDeSaude();
		planoPlatinum.setCategoria("Platina");
		planoPlatinum.setNumero("12-10");
		planoPlatinum.setOperadora("Unimed");
		planoPlatinum.setValidade(LocalDate.of(2030, 12, 31));

//		Criar dois pacientes, você e seu colega do lado
//		nome
//		data de nascimento
//		
//		
		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Marcelo");
		paciente1.setCpf("536.398.618-33");
		paciente1.setRg("14.148-4");
		paciente1.setDataDeNascimento(LocalDate.of(2004, 03, 04));
		paciente1.setTelefone("11 94584-6484");
		paciente1.setEndereco(endereco);
		paciente1.setPlanoDeSaude(planoGold);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Gustavo");
		paciente2.setCpf("536.398.618-33");
		paciente2.setRg("12.150-4");
		paciente2.setDataDeNascimento(LocalDate.of(2004, 03, 04));
		paciente2.setTelefone("11 94542-6819");
		paciente2.setEndereco(endereco2);
		paciente2.setPlanoDeSaude(planoPlatinum);
		
		System.out.println("");
		System.out.println("----Relatório dos Pacientes-----");
		System.out.println("Nome do paciente: " + paciente1.getNome());
		System.out.println("Data de Nascimento: " + paciente1.getDataDeNascimento().getDayOfMonth() + "/" + paciente1.getDataDeNascimento().getMonthValue() + "/" + paciente1.getDataDeNascimento().getYear());
		System.out.println("Telefone do paciente: " + paciente1.getTelefone());
		System.out.println("Cidade do paciente: " + paciente1.getEndereco().getCidade());
		System.out.println("Estado do paciente: " + paciente1.getEndereco().getEstado());
		System.out.println("Operadora do plano de saúde: " + paciente1.getPlanoDeSaude().getOperadora());
		
		System.out.println("---------------------------------");
		System.out.println("Nome do paciente: " + paciente2.getNome());
		System.out.println("Data de Nascimento: " + paciente2.getDataDeNascimento());
		System.out.println("Telefone do paciente: " + paciente2.getTelefone());
		System.out.println("Cidade do paciente: " + paciente2.getEndereco().getCidade());
		System.out.println("Estado do paciente: " + paciente2.getEndereco().getEstado());
		System.out.println("Operadora do plano de saúde: " + paciente2.getPlanoDeSaude().getOperadora());
		
//		Agendar para o paciente1 uma consulta com o fisioterapeuta
//		para do dia 27/09/2023 às 15h45
		
		Agenda agenda1 = new Agenda();
		agenda1.setPaciente(paciente1);
		agenda1.setDataDaConsulta(LocalDate.of(2023, 9, 27));
		agenda1.setHoraDaConsulta(LocalTime.of(15, 45));
		agenda1.setMedico(medico2);
		agenda1.setEspecialidades(especialidadeQuatro);
		
//		exibir agenda do paciente1
		
		System.out.println("");
		System.out.println("------ Agendamentos ------");
		System.out.println("Nome do Paciente: " + agenda1.getPaciente().getNome());
		System.out.println("Data: " + agenda1.getDataDaConsulta());
		System.out.println("Hora: " + agenda1.getHoraDaConsulta());
		System.out.println("Médico: " + agenda1.getMedico().getNome());
		System.out.println("Especialidade: " + agenda1.getEspecialidades().getNome());
		System.out.println("Plano de Saúde: " + agenda1.getPaciente().getPlanoDeSaude().getOperadora());
		System.out.println("Telefone do Paciente: " + agenda1.getPaciente().getTelefone());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

	}
}