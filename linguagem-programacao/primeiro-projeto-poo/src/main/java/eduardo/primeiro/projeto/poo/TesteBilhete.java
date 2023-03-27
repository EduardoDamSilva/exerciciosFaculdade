/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.primeiro.projeto.poo;

/**
 *
 * @author eduardo
 */
public class TesteBilhete {
    public static void main(String[] args) {
        BilheteUnico bilhete01 = new BilheteUnico();
        bilhete01.nomeTitular = "Xampson";
        bilhete01.saldo = 0.0;
        bilhete01.possuiMeiaEntrada = true;
        
        BilheteUnico bilhete02 = new BilheteUnico();
        bilhete02.nomeTitular = "Eduardo";
        bilhete02.saldo = 0.0;
        bilhete02.possuiMeiaEntrada = false;
        
        bilhete01.carregar(150.00);
        bilhete01.usar();
        System.out.println("-------------------------------");
        bilhete02.usar();
        bilhete02.carregar(2.50);
        bilhete02.usar();
        
    }
}
