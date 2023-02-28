/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.atividade01.ac01;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Integer numeroOperacao;
        Integer numeroTabuada;
        Double numeroTabuadaDouble;
        do{
            System.out.println(
                    "Digite o número correspondente a operação desejada:\n"
                            + "1 - Soma\n" 
                            + "2 - Multiplicação\n" 
                            + "3 - Divisão\n" 
                            + "4 - Subtração\n"
                            + "5 - Potência\n"
                            + "6 - Resto\n" 
                            + "0 - Sair"
            );
            numeroOperacao = sc.nextInt();
            System.out.println("");
            switch(numeroOperacao){
                case 0:
                    break;
                case 1:
                    System.out.println("Digite um número inteiro:");
                    numeroTabuada = sc.nextInt();
                    System.out.println("");
                    for(int i = 1; i <= 10; i++){
                        String fraseConta = String.format("%d + %d = %d", numeroTabuada, i, (numeroTabuada + i));
                        System.out.println(fraseConta);
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Digite um número inteiro:");
                    numeroTabuada = sc.nextInt();
                    System.out.println("");
                    for(int i = 1; i <= 10; i++){
                        String fraseConta = String.format("%d x %d = %d", numeroTabuada, i, (numeroTabuada * i));
                        System.out.println(fraseConta);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Digite um número inteiro:");
                    numeroTabuada = sc.nextInt();
                    System.out.println("");
                    for(int i = 1; i <= 10; i++){
                        String fraseConta = String.format("%d ÷ %d = %d", numeroTabuada, i, (numeroTabuada / i));
                        System.out.println(fraseConta);
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Digite um número inteiro:");
                    numeroTabuada = sc.nextInt();
                    System.out.println("");
                    for(int i = 1; i <= 10; i++){
                        String fraseConta = String.format("%d - %d = %d", numeroTabuada, i, (numeroTabuada - i));
                        System.out.println(fraseConta);
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Digite um número inteiro:");
                    numeroTabuadaDouble = sc.nextDouble();
                    System.out.println("");
                    for(double i = 1.0; i <= 10; i++){
                        String fraseConta = String.format("%.0f ** %.0f = %.0f", numeroTabuadaDouble, i, Math.pow(numeroTabuadaDouble, i));
                        System.out.println(fraseConta);
                    }
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Digite um número inteiro:");
                    numeroTabuada = sc.nextInt();
                    System.out.println("");
                    for(int i = 1; i <= 10; i++){
                        String fraseConta = String.format("%d ÷ %d = %d", numeroTabuada, i, (numeroTabuada % i));
                        System.out.println(fraseConta);
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");                    
            }
        } while(numeroOperacao != 0);
    }
}
