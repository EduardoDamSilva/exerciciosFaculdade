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
public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o número base: ");
        Integer numeroBase = sc.nextInt();
        System.out.println("Insira a elevação do número: ");
        Integer numeroElevado = sc.nextInt();
        
        Integer resultado = numeroBase;
        for(int i = 0; i <= numeroElevado; i++){
            if(i == 0){
                resultado = 1;
            } else if (i == 1){
                resultado = numeroBase;
            } else {
                resultado *= numeroBase;
            }
        }
        
        System.out.println("O resultado é: " + resultado);
    }
}
