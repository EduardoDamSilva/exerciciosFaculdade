/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nivelamento;

/**
 *
 * @author edubi
 */
public class Condicao {
    public static void main(String[] args) {
       
        // Igual Js
        // > maior
        // < menor
        // >= maior igual
        // <= menor igual
        // && e
        // || ou
        
        // Diferente JS
        // == não funciona em comparação de strings
        // usar o .equals()
        
        
        Integer numero01 = 10;
        Integer numero02 = 42;
        
        if(numero01 > numero02){
            System.out.println("É maior!");
        } else if(numero01 < numero02) {
            System.out.println("É menor!");
        } else {
            System.out.println("É igual!");
        }
        
        //Cuidado ao nomear a variável
        Boolean bloqueado = false;
        
        if(bloqueado){
            System.out.println("Ta bloqueado!");
        } else {
            System.out.println("Ta desbloqueado!");
        }
        
        // Comparando Strings
        
        String nome01 = "Xampson";
        String nome02 = "Xampson"; // Caso essa variável venha do BD ou do Scanner pode dar errado se igualadas em um if
        
        //Sensitive case
        if(nome01.equals(nome02)){
            System.out.println("É igual!");
        }
        
        //Insensitive case
        if(nome01.equalsIgnoreCase(nome02)){
            System.out.println("É igual");
        }
    }
}
