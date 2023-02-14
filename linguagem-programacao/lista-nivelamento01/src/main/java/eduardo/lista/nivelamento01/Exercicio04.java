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
public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insira o valor unitário do produto: ");
        Double valorDoProduto = sc.nextDouble();
        System.out.println("Insira a quantidade de vendida: ");
        Integer qtdVendas = sc.nextInt();
        System.out.println("Insira o valor pago pelo cliente: ");
        Double valorPago = sc.nextDouble();
        
        
        Double troco = valorPago - (qtdVendas * valorDoProduto);
        
        
        System.out.println("Seu troco será de R$ " + troco);
    }
}
