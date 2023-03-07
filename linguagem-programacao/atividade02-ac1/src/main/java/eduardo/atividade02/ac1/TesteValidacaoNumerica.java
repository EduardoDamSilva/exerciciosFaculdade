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
public class TesteValidacaoNumerica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ValidacaoNumerica val = new ValidacaoNumerica();
        
        Integer numero;
        do{
            System.out.println("Digite um número para verificar se é primo ou não: ");
            numero = sc.nextInt();
            
        }while(numero > 0);
    }
}
