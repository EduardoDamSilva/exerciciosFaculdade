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
public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira seu login: ");
        String login = sc.nextLine();
        System.out.println("Insira sua senha: ");
        String senha = sc.nextLine();
        System.out.println("Insira a quantidade de vezes que você gostaria de poder errar a senha antes do bloqueio: ");
        Integer vezesAntesDoBloqueio = sc.nextInt();
        
        System.out.println("Seu login é " + login + " e sua senha " + senha + ". Você tem " + vezesAntesDoBloqueio + " tentativas antes de ser bloqueado");
        
        
    }
}
