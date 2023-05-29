/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.desafio.conta.corrente;

/**
 *
 * @author eduardo
 */
public class TesteContaCorrente {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente("Eduardo");
        conta.depositar(200.00, 2, 5, 2001);
        conta.sacar(200.00, 2, 5, 2001);
        conta.exibirExtrato();
       
    }
}
