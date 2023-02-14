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
public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o seu salário bruto: ");
        Double salarioBruto = sc.nextDouble();
        
        System.out.println("Insira quanto custa a condução diária só de ida da sua casa para o trabalho: ");
        Double qtdConducao = sc.nextDouble();
        
        Double descontos = (salarioBruto * 0.3) + (qtdConducao * 2 * 22);
        Double salarioComDescontos = salarioBruto - descontos;
        
        System.out.println("Seu salário bruto é R$" + salarioBruto + ", tem um total de R$" + descontos + " em descontos e receberá um líquido de R$" + salarioComDescontos);
        
    }
}
