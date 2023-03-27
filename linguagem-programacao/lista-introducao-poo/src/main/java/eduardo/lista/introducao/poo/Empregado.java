/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.introducao.poo;

/**
 *
 * @author eduardo
 */
public class Empregado {
    
    String nome;
    String cargo;
    Double salario;
    
    void reajustarSalario(Double porcentagemReajuste){
        salario += salario * (porcentagemReajuste / 100);
    }
}
