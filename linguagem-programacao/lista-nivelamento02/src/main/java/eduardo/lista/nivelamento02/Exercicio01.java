/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.nivelamento02;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author eduardo
 */
public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número entre 0 e 10: ");
        Integer numero = sc.nextInt();
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
    
        int contadorDeVezes = 0;
        while(numero != numeroAleatorio){
            System.out.println(numeroAleatorio);
            numeroAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
            contadorDeVezes++;
        }
        
        if(contadorDeVezes <= 3){
            System.out.println("Você é MUITO sortudo");
        } else if (contadorDeVezes >= 4 && contadorDeVezes <= 10){
            System.out.println("Você é sortudo");
        } else {
            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
