/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.matheus.heranca;

import java.util.ArrayList;

/**
 *
 * @author eduardo
 */
public class Restaurante {
    
    private String endereco;
    private String nomeRestaurante;
    private Cozinha cozinha;
    private List<Funcionario> funcionarios;

    public Restaurante(String endereco, String nomeRestaurante, Integer qtdPratosSujos) {
        this.endereco = endereco;
        this.nomeRestaurante = nomeRestaurante;
        this.cozinha = new Cozinha();
        this.funcionarios = new ArrayList();
    }
    
    public void contratarFuncionario(Funcionario func){
        funcionarios.add(func);
    }
    
    public void despedirFuncionario(Funcionario func){
        funcionarios.remove(func);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public Cozinha getCozinha() {
        return cozinha;
    }

    public void setCozinha(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public String toString() {
        String frase = String.format("Restaurante: "
                + "\nNome Restaurante: %s"
                + "\nEndereco: %s"
                + "\nCozinha %s"
                + "\nFuncionarios: %s", nomeRestaurante, endereco, cozinha, funcionarios);
        
        return frase;
    }

}
