/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class SwitchCase {
    public static void main(String[] args) {
        // Cenário: digite um número que faça um print de qual dia da semana
        // esse número representa
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Integer numDigitado = sc.nextInt();
        
        switch(numDigitado){
            case 1: 
                System.out.println("Segundou!");
                break;
            case 2:
                System.out.println("Terçou!");
                break;
            case 3:
                System.out.println("Quartou!");
                break;
            case 4:
                System.out.println("Quintou!");
                break;
            case 5:
                System.out.println("Sextou!");
                break;
            default:
                System.out.println("Número inválido!!!");
                break;
        }
        
        String planoEscolhido = "PRATA";
        
        switch(planoEscolhido){
            case "BRONZE":
                // Faça algo aqui
                break;
            case "PRATA":
                // Faça algo aqui
                break;
            case "OURO":
                // Faça algo aqui
                break;
        } 
        
    }
}
