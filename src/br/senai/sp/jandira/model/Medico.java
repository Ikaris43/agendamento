package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico {

    private String nome;
    private ArrayList<Especialidade> especialidades;
    private String telefone;
    private String email;
    private String crm;
    private Integer codigo;
    private LocalDate dataDeNascimento;
    private static int contador = 0;

    public Medico() {
        gerarCodigo();
    }
    
    public Medico(String nome, String telefone, String crm, Integer codigo, LocalDate dataDeNascimento) {
        gerarCodigo();
        this.nome = nome;
       
        this.telefone = telefone;
        
        this.crm = crm;
      
        this.dataDeNascimento = dataDeNascimento;
        
    }
    
    
    public Medico(String nome, String telefone, String crm, Integer codigo, LocalDate dataDeNascimento, ArrayList<Especialidade> especialidades, String email, Integer contador) {
        gerarCodigo();
        this.nome = nome;
        this.especialidades = especialidades;
        this.telefone = telefone;
        this.email = email;
        this.crm = crm;
        this.contador = codigo;
        this.dataDeNascimento = dataDeNascimento;
        
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

  

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }
    
    public String getMedicoFormatadoComPontoEVirgula() {
        return this.codigo.toString() + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" + this.crm + ";" + this.dataDeNascimento;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
    
  
    
}
