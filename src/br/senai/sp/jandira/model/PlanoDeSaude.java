package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.Period;

public class PlanoDeSaude {
	
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	private static int quantidade;
	
	public PlanoDeSaude() {
		this.quantidade++;
	}
	
	
	public PlanoDeSaude(String operadora) {
		this.quantidade++;
		this.operadora = operadora;
	}
	
	public void setOperadora (String operadora) {
		this.operadora = operadora;
	}
	
	public void setCategoria (String categoria) {
		this.operadora = categoria;
	}
	
	public void setNumero (String numero) {
		this.operadora = numero;
	}
	
	public void setValidade (LocalDate validade) {
		this.validade = validade;
	}
	
	public String getOperadora () {
		return operadora;
	}
	
	public String getCategoria () {
		return categoria;
	}
	
	public String getNumero () {
		return numero;
	}
	
	public LocalDate getValidade() {
		return validade;
	}
	
	public static int getQuantidade() {
		return quantidade;
	}
	
	
	
	
	
	
	
	
	
	
}
