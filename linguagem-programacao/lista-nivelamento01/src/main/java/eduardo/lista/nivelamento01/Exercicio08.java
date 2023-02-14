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
public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o seu nome: ");
        String nome =  sc.nextLine();
        System.out.println("Insira sua primeira nota: ");
        Double nota1 = sc.nextDouble();
        System.out.println("Insira sua segunda nota: ");
        Double nota2 = sc.nextDouble();
        
        Double media = (nota1 + nota2) / 2;
        System.out.println("Olá, " + nome + ". Sua média foi de " + media);
        
    }
}
