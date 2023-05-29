/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.encapsulamento.conta.bancaria;

/**
 *
 * @author eduardo
 */
public class ContaBancaria {
    
    private Double saldo = 0.0;
    private String nomeTitular;
    private String cpf;
    
    void depositar(Double valorDeposito){
        if(valorDeposito > 0){
            saldo += valorDeposito;
            System.out.println("Deposito realizado");
        } else {
            System.out.println("Valor informado inválido");
        } 
    }
    
    void sacar(Double valorSaque){
        if(valorSaque <= saldo && valorSaque > 0){
            saldo -= valorSaque;
            System.out.println("Saque realizado");
        } else {
            System.out.println("Valor informado inválido");
        }
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
