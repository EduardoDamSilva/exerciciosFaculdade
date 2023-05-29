/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.matheus.heranca;

import java.util.Date;

/**
 *
 * @author eduardo
 */
public class Funcionario {

    protected String nome;
    protected String email;
    protected String cpf;
    protected String telefone;
    protected Date dtNascimento;
    protected Integer horasTrabalhadas;
    protected Double salario;

    public Funcionario(String nome, String email, String cpf, String telefone, Date dtNascimento, Integer horasTrabalhadas, Double salario) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dtNascimento = dtNascimento;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salario = salario;
    }

    public void trabalhar(Integer horas) {
        this.horasTrabalhadas += horas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public Double getSalario(){
        return salario;
    }
    
    public void setSalario(){
        this.salario = salario;
    }

    @Override
    public String toString() {
        String frase = String.format(
                "Funcionario:"
                + "\nNome: %s"
                + "\nEmail: %s"
                + "\nCPF: %s"
                + "\nTelefone: %s"
                + "\nData de Nasc: %s"
                + "\nHoras Trabalhadas: %d", nome, email, cpf, telefone, dtNascimento, horasTrabalhadas);

        return frase;
    }

}
