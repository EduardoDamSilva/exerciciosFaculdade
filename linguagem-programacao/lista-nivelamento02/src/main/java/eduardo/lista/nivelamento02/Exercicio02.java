/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.nivelamento02;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        Integer numero;
        Integer soma = 0;
        do{
            System.out.println("Insira um número:");
            numero = sc.nextInt();
            soma += numero;
        } while(numero != 0);
        
        System.out.println("A soma dos número é " + soma);
    }
}
