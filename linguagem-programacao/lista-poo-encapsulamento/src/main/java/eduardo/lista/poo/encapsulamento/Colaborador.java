/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.poo.encapsulamento;

/**
 *
 * @author eduardo
 */
public class Colaborador {
    
    private String nome;
    private String cargo;
    private Double salario;
    
    //Construtor 
    //Sempre public
    //Sempre possui o MESMO nome da classe (igual!)
    //Nunca especificamos retorno
    public Colaborador(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = 0.0;
    }
    
    public Colaborador(String nome, String cargo, Double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Colaborador{" + "nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
    
}
