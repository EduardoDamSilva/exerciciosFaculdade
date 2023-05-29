/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac2.segunda.atividade;

/**
 *
 * @author eduardo
 */
public class TestePet {
    public static void main(String[] args) {
        
        Pet pet = new Pet("Marcos", "Vira-lata");
        PetShop amigoPet = new PetShop("AmigoPet");
        
        amigoPet.darBanho(pet, 100.0);
        amigoPet.darBanho(pet, 100.0, 20);
        
        System.out.println(amigoPet);
        System.out.println(pet);
        
        
    }
}
