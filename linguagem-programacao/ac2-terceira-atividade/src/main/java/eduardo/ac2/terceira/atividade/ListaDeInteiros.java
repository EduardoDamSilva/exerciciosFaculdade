/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac2.terceira.atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class ListaDeInteiros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        List<Integer> numerosInteiros = new ArrayList();
        Integer numero;
        do {            
            System.out.println("Digite números inteiros");
            numero = sc.nextInt();
            numerosInteiros.add(numero);
        } while (numero != 0);
        
        System.out.println("");
        System.out.println("Números pares:");
        for (Integer numerosInteiro : numerosInteiros) {
            if(numerosInteiro % 2 == 0){
                System.out.println(numerosInteiro);
            }
        }
        
        System.out.println("");
        System.out.println("Números impares:");
        for (Integer numerosInteiro : numerosInteiros) {
            if(numerosInteiro % 2 != 0){
                System.out.println(numerosInteiro);
            }
        }
        
        System.out.println("");
        System.out.println("Soma de todos os números: ");
        Integer total = 0;
        for (Integer numerosInteiro : numerosInteiros) {
            total += numerosInteiro;
        }
        
        System.out.println(total);
        
        System.out.println("");
        System.out.println("O menor número da lista:");
        Integer menorNumero = numerosInteiros.get(0);
        for (Integer numerosInteiro : numerosInteiros) {
            if (menorNumero > numerosInteiro){
                menorNumero = numerosInteiro;
            }
        }
        System.out.println(menorNumero);
        
        System.out.println("");
        System.out.println("O maior número da lista:");
        Integer maiorNumero = numerosInteiros.get(0);
        for (Integer numerosInteiro : numerosInteiros) {
            if (maiorNumero < numerosInteiro){
                maiorNumero = numerosInteiro;
            }
        }
        System.out.println(maiorNumero);
    }
}
