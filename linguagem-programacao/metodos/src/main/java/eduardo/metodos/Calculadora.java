/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.metodos;

/**
 *
 * @author eduardo
 */
public class Calculadora {
    Double somar(Double n1, Double n2){
        return n1 + n2;
    }
    
    //Sobrecarga = a mesma ação com diferentes argumentos:
    Double somar(Double n1, Double n2, Double n3 ){
        return n1 + n2;
    }
    
    void exibirSoma(Double n1, Double n2){
        System.out.println(n1 + n2);
    }
    
    // Faça os métodos para divisão, subtração e multiplicação com retorno
    Double subtrair(Double n1, Double n2){
        return n1 - n2;
    }
    
    Double divisao(Double n1,  Double n2){
        return n1 / n2;
    }
    
    Double multiplicacao(Double n1, Double n2){
        return n1 * n2;
    }
}
