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
public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira seu nome: ");
        String nome = sc.nextLine();
        
        System.out.println("Olá, " + nome + "! Qual o ano de seu nascimento?");
        Integer anoDeNascimento = sc.nextInt();
        
        Integer idadeEm2030 = 2030 - anoDeNascimento;
        
        System.out.println("Em 2030 você terá " + idadeEm2030);
    }
}
