/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nivelamento;

/**
 *
 * @author edubi
 */
public class Operador {
    public static void main(String[] args) {
        
        //Igual ao Js
        
        // Adição: +
        // Subtração: -
        // Multiplicação: *
        // Divisão: /
        // Resto: %
        

        // Diferente no JS
        // Não temos **
        // Potência
        
        
        Integer numero01 = 5;
        Integer numero02 = 2;
        
        // 01) Soma
        Integer soma = numero01 + numero02;
        System.out.println("Soma com váriavel: " + soma);
        // Para fazer a soma no print é necessário que isole os dois numeros
        System.out.println("Soma no print: " + (numero01 + numero02));
        
        // 02) Subtração
        System.out.println("Subtração: " + (numero01 - numero02));
        
        // 03) Multiplicação
        System.out.println("Multiplicação: " + (numero01 * numero02));
        
        // 04) Divisão
        System.out.println("Divisão: " + (numero01 / numero02));
        
        // 05) Resto
        System.out.println("Resto: " + (numero01 % numero02));
        
        // 06) Potência
        Double potencia = Math.pow(2.0, 5.0);
        System.out.println("Potência: " + potencia);
        
        // Uma classe também pode ter variáveis que nos ajudam
        System.out.println("Valor de PI: " + Math.PI);
        System.out.println("Qual o valor máximo de um Integer: " + Integer.MAX_VALUE);
    }
}
