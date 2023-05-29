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
public class AuxiliarDeCozinha extends Funcionario{

    public AuxiliarDeCozinha(String nome, String email, String cpf, String telefone, Date dtNascimento, Integer horasTrabalhadas, Double salario) {
        super(nome, email, cpf, telefone, dtNascimento, horasTrabalhadas, salario);
    }
   
    public void limparCozinha(Cozinha cozinha){
        cozinha.setCozinhaLimpa(true);
    }
    
    public void limparPratos(Integer qtdPratosLimpos, Cozinha cozinha){
        cozinha.setQtdPratosSujos(cozinha.getQtdPratosSujos() - qtdPratosLimpos);
    }
}
