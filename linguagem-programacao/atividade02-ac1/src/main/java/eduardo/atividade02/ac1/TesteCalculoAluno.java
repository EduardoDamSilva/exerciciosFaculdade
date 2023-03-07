/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.atividade02.ac1;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class TesteCalculoAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculoAluno calc = new CalculoAluno();
        
        System.out.println("Insira a primeira nota do aluno: ");
        Double nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota do aluno: ");
        Double nota2 = sc.nextDouble();
        
        Double media = calc.calcularMedia(nota1, nota2);
        System.out.println("Média do aluno: " + media);
    }
}
