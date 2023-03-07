/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.atividade02.ac1;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class TesteCalculoNutricao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculoNutricao calc = new CalculoNutricao();
        
        System.out.println("Bem-vindo ao programa para calcular IMC");
        System.out.println("Digite sua altura:" );
        Double altura = sc.nextDouble();
        System.out.println("Digite seu peso:");
        Double peso = sc.nextDouble();
        calc.calcularIMC(peso, altura);
    }
}
