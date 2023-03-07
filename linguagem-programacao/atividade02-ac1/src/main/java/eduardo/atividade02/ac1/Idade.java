/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.atividade02.ac1;

/**
 *
 * @author eduardo
 */
public class Idade {
    void classificaIdade(Integer idade){
        if (idade >= 0 && idade <= 2){
            System.out.println("Bebê");
        } else if (idade <= 11){
            System.out.println("Criança");
        } else if (idade <= 19){
            System.out.println("Adolescente");
        } else if (idade <= 30){
            System.out.println("Jovem");
        } else if (idade <= 60) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
