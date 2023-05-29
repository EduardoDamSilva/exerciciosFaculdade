/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.exemplo.relacionamento;

/**
 *
 * @author eduardo
 */
public class Whatsapp {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Manoel", "(11) 123");
        Contato contato02 = new Contato("Miniguiti", "(11) 124");
        Contato contato03 = new Contato("Cristian", "(11) 125");
    
        Grupo grupo01 = new Grupo("Trabalho");
        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);
        
        Grupo grupo02 = new Grupo("Amigos do Fut");
        grupo02.adicionar(contato03);
        
        System.out.println(grupo01);
        System.out.println(grupo02);
    }
}
