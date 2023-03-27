/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.terceira.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class TesteClasseSocial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClasseSocial classe = new ClasseSocial();
        
        System.out.println("Digite sua renda: ");
        Double salario = sc.nextDouble();
        Double qtdSM = classe.calcularQtdSalarioMinimos(salario);
        String classeSocial = classe.idenficarClasseSocial(qtdSM);
        
        System.out.println(
                String.format("Você recebe aproximadamente %.1f salários-minimos", qtdSM)
        );
        
        System.out.println("Você pertence a classe social: " + classeSocial);
    }
}
