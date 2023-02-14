/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.nivelamento01;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de filhos de 0 a 3 anos que você possui: ");
        Integer qtdFilhos0a3 = sc.nextInt();
        System.out.println("Insira a quantidade de filhos de 4 a 16 anos que você possui: ");
        Integer qtdFilhos4a16 = sc.nextInt();
        System.out.println("Insira a quantidade de filhos de 17 a 18 anos que você possui: ");
        Integer qtdFilhos17a18 = sc.nextInt();
        
        Double valorBolsa = (25.12 * qtdFilhos0a3) + (15.88 * qtdFilhos4a16) + (12.44 * qtdFilhos17a18);
        Integer qtdFilhos = qtdFilhos0a3 + qtdFilhos4a16 + qtdFilhos17a18;
        
        System.out.println("Você tem um total de " + qtdFilhos + " filhos e vai receber R$" + valorBolsa + " de bolsa");
        
    }
}
