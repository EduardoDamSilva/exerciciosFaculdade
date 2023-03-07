/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.metodos;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Teste {
    public static void main(String[] args) {
        String nome01 = "Eduardo";
        String nome02 = "Xampson";
        
        // para ter acesso aos metodos precisamos criar um objeto
        // da classe que esse método foi criado
        // Para instânciar precisamos colocar a palavra new
        Utilitaria util = new Utilitaria();
        Calculadora calc = new Calculadora();
        Scanner sc = new Scanner(System.in);
        
        // Chamar método = invocar
        util.exibirNomeFormatado(nome01);
        util.exibirNomeFormatado(nome02);
        
        //Usando a calculadora
        // Como é um método com retorno, 
        // lembrar de guardar o valor em uma var
        Double soma = calc.somar(10.0, 32.0);
        
        Double resultadoSubtracao = calc.subtrair(42.0, 10.0);
        
    }
}
