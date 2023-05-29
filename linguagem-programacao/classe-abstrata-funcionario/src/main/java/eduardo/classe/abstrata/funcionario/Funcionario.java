/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.classe.abstrata.funcionario;

/**
 *
 * @author eduardo
 */
public abstract class Funcionario {
    
    private String cpf;
    private String nome;
    
    public abstract Double calcSalario();

    public Funcionario(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        String frase = String.format("Funcionario: \n"
                + "CPF: %s \n"
                + "Nome: %s", cpf, nome);
        
        return frase;
    }
    
    
}
