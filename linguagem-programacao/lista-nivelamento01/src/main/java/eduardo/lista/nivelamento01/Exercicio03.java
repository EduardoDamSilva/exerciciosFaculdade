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
public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de tempo em minutos(valor inteiro) que você passa se aquecendo: ");
        Integer minutosAquecendo = sc.nextInt();
        System.out.println("Insira a quantidade de tempo em minutos(valor inteiro) que você passa fazendo aerobicos: ");
        Integer minutosAerobicos = sc.nextInt();
        System.out.println("Insira a quantidade de tempo em minutos(valor inteiro) que você passa fazendo musculação: ");
        Integer minutosMusculacao = sc.nextInt();
        
        Integer caloriasPerdidas = (12 * minutosAquecendo) + (20 * minutosAerobicos) + (25 * minutosMusculacao);
        Integer totalMinutos = minutosAquecendo + minutosAerobicos + minutosMusculacao;
        
        
        System.out.println("Olá Jorge. Você fez um total de " + totalMinutos + " minutos de exercício e perdeu cerca de " + caloriasPerdidas + " calorias.");
    }
}
