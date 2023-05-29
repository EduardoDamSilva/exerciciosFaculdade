/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.matheus.heranca;

import java.util.Date;

/**
 *
 * @author eduardo
 */
public class Cozinheiro extends Funcionario{
    
    private String especialidade;

    public Cozinheiro(String especialidade, String nome, String email, String cpf, String telefone, Date dtNascimento, Integer horasTrabalhadas, Double salario) {
        super(nome, email, cpf, telefone, dtNascimento, horasTrabalhadas, salario);
        this.especialidade = especialidade;
    }

    public void cozinharPrato(Cozinha cozinha){
        
    }
    
    public void trabalhar(Integer horas){
        
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Cozinheiro: "
                + "\nEspecialidade: " + especialidade;
    }
    
    
}
