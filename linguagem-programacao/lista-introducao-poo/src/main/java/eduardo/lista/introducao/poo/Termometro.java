/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.introducao.poo;

/**
 *
 * @author eduardo
 */
public class Termometro {
    
    Double temperaturaAtual;
    Double temperaturaMax;
    Double temperaturaMin;
    
    void aumentaTemperatura(Double aumentoTemperatura){
        temperaturaAtual += aumentoTemperatura;
        
        if(temperaturaAtual > temperaturaMax){
            temperaturaMax = temperaturaAtual;
        }
    }
    
    void diminuiTemperatura(Double diminuicaoTemperatura){
        temperaturaAtual -= diminuicaoTemperatura;
        
        if(temperaturaAtual < temperaturaMin){
            temperaturaMin = temperaturaAtual;
        }
    }
    
    void exibeFahreinheit(){
        Double fahreinheit = temperaturaAtual + 273;
        System.out.println("A temperatura em é Fahreinheit: " + fahreinheit);
    }
}
