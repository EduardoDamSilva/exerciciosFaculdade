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
public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um número(número real): ");
        Double numero1 = sc.nextDouble();
        System.out.println("Insira um outro número(número real): ");
        Double numero2 = sc.nextDouble();
        
        System.out.println("Resultado da soma: \n" + (numero1 + numero2) );
        System.out.println("Resultado da subtração: \n" + (numero1 - numero2) );
        System.out.println("Resultado da multiplicação: \n" + (numero1 * numero2) );
        System.out.println("Resultado da divisão: \n" + (numero1 / numero2) );
    }
}
