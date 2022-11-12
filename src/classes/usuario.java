/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Hendrew
 */
public class usuario {
    
    private String nome;
    private String cpf;
    private String email;
    private String celular;
    private String cidade;
    private String UF;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public String getCidade() {
        return cidade;
    }

    public String getUF() {
        return UF;
    }
    
    
    
    
    
    
    
        public void limpaCliente(){
       nome = "";
       cpf = "";
       cidade = "";
       email = "";
       cidade = "";
       UF = "";
    }   
}



