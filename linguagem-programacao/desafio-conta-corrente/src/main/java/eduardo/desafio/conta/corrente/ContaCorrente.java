/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.desafio.conta.corrente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class ContaCorrente {
    
    private String titular;
    private Double saldo;
    private List<Historico> historico;

    public ContaCorrente(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.historico = new ArrayList();
    }
    
    public void depositar(Double valor, Integer dia, Integer mes, Integer ano){
        this.saldo += valor;
        historico.add(new Historico(dia, mes, ano, valor, "Deposito"));
        System.out.println("Depósito realizado com sucesso");
    }
    
    public void sacar(Double valor, Integer dia, Integer mes, Integer ano){
        if(saldo >=valor){
            this.saldo -= valor;
            historico.add(new Historico(dia, mes, ano, valor, "Saque"));
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
            
        }
        
    }
    
    public void exibirExtrato(){
        for(Historico hist : historico){
            System.out.println(hist);
        }
    }
}
