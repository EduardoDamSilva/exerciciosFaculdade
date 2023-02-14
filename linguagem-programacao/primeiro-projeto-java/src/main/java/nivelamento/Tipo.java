/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nivelamento;

/**
 *
 * @author edubi
 */
public class Tipo {
    public static void main(String[] args) {
        String nome = "Eduardo";
        Integer idade = 22;
        // o /t da um tab antes do texto
        System.out.println("\tMeu nome é" + nome + "\ntenho" + idade);
        
        
        //Tipo primitivo vs Tipo Wrapper
        //Tipos wrapper sãp classes, logo possuem métodos e o tipo primitivo não
        // Outra diferença é que primitivos sempre possuem valores, mesmo que não inicializados
        int inteiroTipoPrimitivo; // começa com o valor 0
        Integer inteiroTipoWrapper; // começa com o valor null
    }
}
