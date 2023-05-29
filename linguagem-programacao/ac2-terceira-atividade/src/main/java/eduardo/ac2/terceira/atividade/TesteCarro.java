/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac2.terceira.atividade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class TesteCarro {
    public static void main(String[] args) {
        List<Carro> listaCarros = new ArrayList();
        
        Carro carro1 = new Carro("Onix", 80000.0, 2023, "Chevrolet");
        Carro carro2 = new Carro("308", 120000.0, 2023, "Pegeout");
        Carro carro3 = new Carro("Tracker", 150000.0, 2023, "Chevrolet");
        Carro carro4 = new Carro("Corola", 150000.0, 2023, "Toyota");
        Carro carro5 = new Carro("Macan", 500000.0, 2023, "Porsche");
        
        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);
        listaCarros.add(carro4);
        listaCarros.add(carro5);
        
        System.out.println("");
        System.out.println("Carros com o ano maior que 2018:");
        for (Carro carro : listaCarros) {
            if(carro.getAno() > 2018){
                System.out.println(carro);
            }
        }
        
        System.out.println("");
        System.out.println("Carros com o valor menor que 60.000");
        for (Carro carro : listaCarros) {
            if(carro.getValor() < 60000){
                System.out.println(carro);
            }
        }
        System.out.println("");
        System.out.println("Carros com a marca Chevrolet:");
        for (Carro carro : listaCarros) {
            if(carro.getMarca() == "Chevrolet"){
                System.out.println(carro);
            }
        }
    }
}
