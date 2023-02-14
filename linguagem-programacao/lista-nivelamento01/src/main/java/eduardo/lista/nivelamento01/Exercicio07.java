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
public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o limite de peso do elevador(número real): ");
        Double pesoElevador = sc.nextDouble();
        System.out.println("Insira o limite de pessoas no elevador(número inteiro): ");
        Integer limitePessoas = sc.nextInt();
        System.out.println("Insira o peso da primeira pessoa que entrou no elevado(numero real): ");
        Double pesoPrimeiraPessoa = sc.nextDouble();
        System.out.println("Insira o peso da segunda pessoa que entrou no elevado(numero real): ");
        Double pesoSegundaPessoa = sc.nextDouble();
        System.out.println("Insira o peso da terceira pessoa que entrou no elevado(numero real): ");
        Double pesoTerceiraPessoa = sc.nextDouble();
        
        Double pesoTotal = pesoPrimeiraPessoa + pesoSegundaPessoa + pesoTerceiraPessoa;
        
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas + " pessoas.\nO Peso total no elevador é de " + pesoTotal + ", sendo que ele suporta " + pesoElevador);
        
    }
}
