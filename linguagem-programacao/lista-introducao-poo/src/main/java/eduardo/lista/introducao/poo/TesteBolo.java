/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.introducao.poo;

/**
 *
 * @author eduardo
 */
public class TesteBolo {
    public static void main(String[] args) {
        
        Bolo bolo1 = new Bolo();
        Bolo bolo2 = new Bolo();
        Bolo bolo3 = new Bolo();
        
        bolo1.sabor = "chocolate";
        bolo1.valor = 20.00;
        
        bolo2.sabor = "laranja";
        bolo2.valor = 15.00;
        
        bolo3.sabor = "abacaxi";
        bolo3.valor = 18.00;
        
        bolo1.comprarBolo(10);
        bolo2.comprarBolo(30);
        bolo3.comprarBolo(110);
        
        bolo1.exibirRelatorio();
        bolo2.exibirRelatorio();
        bolo3.exibirRelatorio();
    }
}
