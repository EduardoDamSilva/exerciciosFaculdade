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
public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira um número de 1 a 100");
        Integer numero = sc.nextInt();
        
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
        Integer posicaoNumeroSorteado = 0;
        Integer qtdParesSorteados = 0;
        Integer qtdImparesSorteados = 0;
        for(int i = 1; i <= 200; i++){
            if(numero == numeroAleatorio && posicaoNumeroSorteado == 0){
                posicaoNumeroSorteado = i;
            }
            
            if (numeroAleatorio % 2 == 0){
                qtdParesSorteados++;
            } else {
                qtdImparesSorteados++;
            }
            numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
        }
        
        System.out.println("O seu número foi sorteado pela primeira vez na posição:" + posicaoNumeroSorteado);
        System.out.println("Quantidade de números pares sorteados: " + qtdParesSorteados);
        System.out.println("Quantidade de números impares sorteados: " + qtdImparesSorteados);
    }
}
