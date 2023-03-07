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
public class TesteIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Idade idadeClasse = new Idade();
        
        System.out.println("Insira sua idade: ");
        Integer idade = sc.nextInt();
        idadeClasse.classificaIdade(idade);
        
    }
}
