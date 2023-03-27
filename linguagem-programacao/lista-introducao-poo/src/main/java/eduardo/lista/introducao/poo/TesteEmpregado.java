/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.introducao.poo;

/**
 *
 * @author eduardo
 */
public class TesteEmpregado {
    public static void main(String[] args) {
        
        Empregado empregado01 = new Empregado();
        empregado01.nome = "João";
        empregado01.salario = 5400.00;
        empregado01.cargo = "Analista de Sistemas";
        
        empregado01.reajustarSalario(15.00);
        System.out.println(empregado01.nome);
        System.out.println(empregado01.cargo);
        System.out.println(empregado01.salario);
        
        Empregado empregado02 = new Empregado();
        empregado02.nome = "Eduardo";
        empregado02.salario = 50000.00;
        empregado02.cargo = "Diretor de Tecnologia";
        
        empregado02.reajustarSalario(15.00);
        System.out.println(empregado02.nome);
        System.out.println(empregado02.cargo);
        System.out.println(empregado02.salario);
    }
}
