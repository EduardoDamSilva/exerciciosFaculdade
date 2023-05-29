/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.classe.abstrata.funcionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Empresa {
    
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList();
    }
    
    public void adicionaFunc(Funcionario f){
        funcionarios.add(f);
    }
    
    public void exibeTodos(){
        for(Funcionario funcionario: funcionarios){
            System.out.println(funcionario);
        }
    }
    
    public void exibeTotalSalario(){
        Double totalSalario = 0.0;
        for(Funcionario funcionario: funcionarios){
            totalSalario += funcionario.calcSalario();
        }
        System.out.println("Total Salario: " + totalSalario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
}
