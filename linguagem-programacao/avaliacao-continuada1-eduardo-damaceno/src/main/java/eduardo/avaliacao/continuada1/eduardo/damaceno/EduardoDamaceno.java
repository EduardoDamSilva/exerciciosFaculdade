/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.avaliacao.continuada1.eduardo.damaceno;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class EduardoDamaceno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer numSelecionado;
        Double valorDeposito;
        Double valorSaque;
        Double totalNaConta = 0.0;
        do{
            System.out.println("SPTech Investimentos");
            System.out.println("---------------------------");
            System.out.println("Olá o que deseja fazer:");
            System.out.println("---------------------------");
            System.out.println(
                    "1 - Depositar\n"
                    + "2 - Sacar\n"
                    + "3 - Simular Rendimentos\n"
                    + "0 - Sair\n");
            numSelecionado = sc.nextInt();
            
            
            switch(numSelecionado){
                case 1: 
                    System.out.println("Digite o valor do depósito:");
                    valorDeposito = sc.nextDouble();
                    
                    if(valorDeposito > 0){
                        totalNaConta += valorDeposito;
                        System.out.println(String.format("Depósito realizado - Saldo atual: R$%.2f", totalNaConta));
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;
                case 2:
                    System.out.println("Digite o valor do saque:");
                    valorSaque = sc.nextDouble();
                    
                    if(valorSaque > 0 && totalNaConta >= valorSaque){
                        totalNaConta -= valorSaque;
                        System.out.println(String.format("Saque realizado - Saldo atual: R$%.2f", totalNaConta));
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;
                case 3:
                    if (totalNaConta > 0){
                        System.out.println(String.format("Saque atual: R$%.2f", totalNaConta));
                        Double rendimentos = totalNaConta;
                        for(int i = 1; i <= 12; i++){
                            rendimentos *= 1.1;
                            
                            System.out.println("---------------------------");
                            System.out.println(String.format("| Mês %d | Saldo: %.2f", i, rendimentos));
                            System.out.println("---------------------------");
                        }
                    } else {
                        System.out.println("Saldo Zerado, opção inválida.");
                    }
                    
            }
        }while(numSelecionado != 0);
    }
}
