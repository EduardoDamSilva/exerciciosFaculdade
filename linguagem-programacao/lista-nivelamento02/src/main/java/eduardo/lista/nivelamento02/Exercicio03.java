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
public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o nome de usuário: ");
        String loginDoUsuario = sc.nextLine();
        System.out.println("Insira a sua senha: ");
        String senhaDoUsuario = sc.nextLine();
        
        while(!loginDoUsuario.equals("admin") || !senhaDoUsuario.equals("#SPtech2022")){
            System.out.println("Login e/ou senha inválidos");
            System.out.println("Insira o nome de usuário: ");
            loginDoUsuario = sc.nextLine();
            System.out.println("Insira a sua senha: ");
            senhaDoUsuario = sc.nextLine();
        }
        
        System.out.println("Login realizado com sucesso");
    }
}
