package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;


public class PlanoDeSaude {
    
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	private static int quantidade = 0;
        private Integer codigo;
        
        private Boolean verdadeiro;
        private Boolean falso;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public PlanoDeSaude() {
            gerarCodigo();
        }
        
    

    public Boolean getCheckVerdadeiro() {
        return verdadeiro = true;
    }
    
    public Boolean GetCheckFalso () {
        return falso = false;
    }
	
        
	
	public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
 
            this.categoria = categoria;
            this.operadora = operadora;
            this.validade = validade;           
            this.numero = numero;
		gerarCodigo();
		
	}
    
	public void setOperadora (String operadora) {
                if (operadora.length() >= 3) {
            this.operadora = operadora;
            getCheckVerdadeiro();           
        } else {
                    GetCheckFalso();
            JOptionPane.showMessageDialog(null, operadora + " não é uma operadora válida!\nDeve conter pelo menos 3 letras! ");
                   
        }
	}
	
	public void setCategoria (String categoria) {
		if (categoria.length() >= 3) {
            this.categoria = categoria;
            getCheckVerdadeiro();
        } else {
                    GetCheckFalso();
            JOptionPane.showMessageDialog(null, categoria + " não é uma categoria válida!\nDeve conter pelo menos 3 letras! ");
        }
	}
	
	public void setNumero (String numero) {
            
            
            
		if (numero.length() >= 3) {
            this.numero = numero;
            getCheckVerdadeiro(); 
                } else {
                    GetCheckFalso();
            JOptionPane.showMessageDialog(null, numero + " não é um numero válido!\nDeve conter pelo menos 3 digitos! ");
        }
            
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
    
    public String getPlanoDeSaudeFormatadoComPontoEVirgula () {
        return this.codigo.toString() + ";" + this.operadora + ";" + this.categoria + ";" + this.numero + ";" + this.validade.toString();
    }
    
    public PlanoDeSaude (String operadora, String categoria, String numero, LocalDate validade, Integer codigo) {
 
            this.categoria = categoria;
            this.operadora = operadora;
            this.validade = validade;           
            this.numero = numero;
            this.quantidade = codigo;
            
		
	}
    

    
        
	
	
	
	
	
	
	
	
	
}
