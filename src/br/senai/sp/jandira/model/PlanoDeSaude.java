package br.senai.sp.jandira.model;

import java.time.LocalDate;


public class PlanoDeSaude {
    
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	private static int quantidade = 0;
        private Integer codigo;
	
	public PlanoDeSaude() {
            
            
		gerarCodigo();
        }
	
	
	public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
            this.operadora = operadora;
            this.categoria = categoria;
            this.validade = validade;
            this.numero = numero;
		gerarCodigo();
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
	
	public static Integer getQuantidade() {
		return quantidade;
	}
	
        private void gerarCodigo () {
            this.quantidade++;
            this.codigo = quantidade;
        }

        public Integer getCodigo() {
            return codigo;
        }
        
        
	
	
	
	
	
	
	
	
	
}
