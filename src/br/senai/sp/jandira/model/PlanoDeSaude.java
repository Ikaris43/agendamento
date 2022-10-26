package br.senai.sp.jandira.model;

import java.time.LocalDate;
import javax.swing.JOptionPane;


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
 
            this.categoria = categoria;
            this.operadora = operadora;
            this.validade = validade;           
            this.numero = numero;
		gerarCodigo();
		
	}
        
        private void checagemOperadora (String operadora) {
               if (operadora.length() >= 3) {
            this.operadora = operadora;
            
        } else {
            JOptionPane.showMessageDialog(null, operadora + " não é um nome válido!\nDeve conter pelo menos 3 letras! ");
           
        }
        }
        
         public Boolean checagemCategoria (String categoria) {
               if (categoria.length() >= 3) {
            this.categoria = categoria;
               }
            return true;
            
         }


     
        
	
	public void setOperadora (String operadora) {
		this.operadora = operadora;
	}
	
	public void setCategoria (String categoria) {
		this.categoria = categoria;
	}
	
	public void setNumero (String numero) {
		this.numero = numero;
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
	
	
        private void gerarCodigo () {
            quantidade++;
            codigo = quantidade;
        }

    public Integer getCodigo() {
        return codigo;
    }

    
        
	
	
	
	
	
	
	
	
	
}
