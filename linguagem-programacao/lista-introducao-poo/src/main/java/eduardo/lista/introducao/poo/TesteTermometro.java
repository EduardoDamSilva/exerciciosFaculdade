/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.introducao.poo;

/**
 *
 * @author eduardo
 */
public class TesteTermometro {
    public static void main(String[] args) {
        
        Termometro term1 = new Termometro();
        term1.temperaturaAtual = 30.0;
        term1.temperaturaMax = 50.0;
        term1.temperaturaMin = 20.0;
        
        term1.aumentaTemperatura(20.0);
        term1.diminuiTemperatura(70.0);
        term1.exibeFahreinheit();
        
    }
}
