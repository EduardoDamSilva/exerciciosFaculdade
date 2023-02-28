/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author eduardo
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        
        // No Java temos a classe Math.random
        // Mas precisamos criar objeto, tipo scanner
        
        // Inteiro aleatório:
        Integer numInteiroAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
        
        System.out.println("Inteiro aleatório: " + numInteiroAleatorio);
        
        Double numeroQuebradoAleatorio = ThreadLocalRandom.current().nextDouble(1.3, 30.7);
        
        System.out.println("Double aleátorio: " + numeroQuebradoAleatorio);
        System.out.println(String.format(
                "Double aleatório: %.3f", 
                numeroQuebradoAleatorio)
        );
    }
}
