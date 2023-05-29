/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.encapsulamento.conta.bancaria;

/**
 *
 * @author eduardo
 */
public class TesteConta {
    public static void main(String[] args) {
        
        ContaBancaria conta01 = new ContaBancaria();
        conta01.setNomeTitular("Eduardo");
        
        ContaBancaria conta02 = new ContaBancaria();
        conta02.setNomeTitular("Pedrão");
        
        System.out.println("Teste C1:");
        conta01.sacar(10.0);
        conta01.depositar(20.0);
        conta01.sacar(5.0);
        System.out.println(conta01.getSaldo());
        
        System.out.println("Teste C2:");
        conta02.depositar(500.0);
        conta02.sacar(150.00);
        conta02.depositar(-150.00);
        System.out.println(conta02.getSaldo());
    }
}
