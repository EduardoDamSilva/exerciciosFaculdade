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
public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // for de 0 a 10
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        
        //while de 0 a 10
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        
        //minigame while - adivinhe o número
        System.out.println("Digite um número: ");
        Integer numeroDigitado = sc.nextInt();
        
        while(numeroDigitado != 42){
            System.out.println("Adivinhe o número:");
            numeroDigitado = sc.nextInt();
        
        }
        
        System.out.println("Acertou!");
        
        //do while
        System.out.println("Digite um número: ");
        Integer numeroDigitado2 = sc.nextInt();
        
        do{
            System.out.println("Adivinhe o número:");
            numeroDigitado2 = sc.nextInt();
        }while(numeroDigitado2 != 42);
        
    }
}
