/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.introducao.poo;

/**
 *
 * @author eduardo
 */
public class Bolo {
    
    String sabor;
    Double valor;
    Integer quantidadeVendida = 0;
    
    void comprarBolo(Integer qtdBolo){
        if (qtdBolo > 100){
            System.out.println("Seu pedido ultrapassou nosso limite diário para esse bolo.");
        } else {
            quantidadeVendida += qtdBolo;
        }
    }
    
    void exibirRelatorio(){
        Double resultado = valor * quantidadeVendida;
        System.out.println("O bolo sabor " + sabor + ", foi comprado "+ quantidadeVendida +" vezes hoje, totalizando " + resultado);
    }
}
