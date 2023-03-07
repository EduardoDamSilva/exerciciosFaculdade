/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.metodos;

/**
 *
 * @author eduardo
 */
public class Utilitaria {
    //Metodo é composto por:
    // Retorno: não tem, é void!
    // Nome: exibirLinha
    // Argumentos: dentro dos ()
    // Corpo: dentro das chaves
    
    void exibirLinha(){
        System.out.println("-------------------------------");
    }
    
    void exibirNome(String nome){
        System.out.println("Meu nome é: " + nome);
    }
    
    // Chamar método dentro de método
    void exibirNomeFormatado(String nome){
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
}
