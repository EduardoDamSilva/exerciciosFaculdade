/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.atividade02.ac1;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class TesteDescontoProgressivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DescontoProgressivo desc = new DescontoProgressivo();
        
        System.out.println("Bem-vindo ao sistema de desconto progressivo!");
        System.out.println("");
        System.out.println("Digite o valor unitário do produto:");
        Double valorUnid = sc.nextDouble();
        System.out.println("Digite a quantidade: ");
        Double qtd = sc.nextDouble();
        
        desc.exibirNotaFiscal(valorUnid, qtd);
    }
}
