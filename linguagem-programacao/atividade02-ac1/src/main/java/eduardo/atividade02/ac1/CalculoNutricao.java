/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.atividade02.ac1;

/**
 *
 * @author Usuário
 */
public class CalculoNutricao {
    void calcularIMC(Double peso, Double altura){
        Double IMC = peso / (altura * altura);
        
        System.out.println(String.format("Seu IMC é de %.2f", IMC));
    }
}
