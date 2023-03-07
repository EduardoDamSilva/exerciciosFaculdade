/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.terceira.lista.nivelamento;

/**
 *
 * @author eduardo
 */
public class ClasseSocial {
    Double calcularQtdSalarioMinimos(Double salario){
        return salario / 1045.0;
    }
    
    String indificarClasseSocial(Double qtdSM){
        if (qtdSM < 2){
            return "E";
        } else if (qtdSM < 4){
            return "D";
        } else if (qtdSM < 10){
            return "C";
        } else if (qtdSM < 20){
            return "B";
        } else {
            return "A";
        }
    }
}
