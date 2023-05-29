/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.poo.encapsulamento;

/**
 *
 * @author eduardo
 */
public class TestePokemon {
    public static void main(String[] args) {
        
        Pokemon poke01 = new Pokemon();
        Pokemon poke02 = new Pokemon();
        TreinadorPokemon treinador = new TreinadorPokemon();
        
        poke01.setNome("Charmander");
        poke01.setTipo("Fogo");
        
        poke02.setNome("Squirtle");
        poke02.setTipo("Água");
        
        treinador.treinarPokemon(poke01);
        treinador.treinarPokemon(poke01);
        treinador.treinarPokemon(poke01);
        treinador.treinarPokemon(poke01);
        treinador.treinarPokemon(poke01);
        
        System.out.println("Pokemon 1: ");
        System.out.println(poke01.getNome());
        System.out.println(poke01.getTipo());
        System.out.println(poke01.getForca());
        System.out.println(poke01.getDoces());
        
        treinador.evoluirPokemon(poke01, "Charmeleon");
        
        System.out.println("---------------------------------");
        System.out.println("Pokemon 1: ");
        System.out.println(poke01.getNome());
        System.out.println(poke01.getTipo());
        System.out.println(poke01.getForca());
        System.out.println(poke01.getDoces());
        
        treinador.treinarPokemon(poke02);
        treinador.treinarPokemon(poke02);
        
        System.out.println("---------------------------------");
        System.out.println("Pokemon 2: ");
        System.out.println(poke02.getNome());
        System.out.println(poke02.getTipo());
        System.out.println(poke02.getForca());
        System.out.println(poke02.getDoces());
        
        treinador.evoluirPokemon(poke02, "Wartotle");
        
        System.out.println("---------------------------------");
        System.out.println("Treinador: ");
        System.out.println(treinador.getNome());
        System.out.println(treinador.getNivel());
        
        
        
    }
}
