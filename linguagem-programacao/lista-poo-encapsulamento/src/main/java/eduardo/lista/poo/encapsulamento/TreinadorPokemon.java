/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.poo.encapsulamento;

/**
 *
 * @author eduardo
 */
public class TreinadorPokemon {
    
    private String nome;
    private Integer nivel = 0;
    
    void treinarPokemon(Pokemon pokemon){
        Double incrementoDeForca = pokemon.getForca() * 1.1;
        pokemon.setForca(incrementoDeForca);
        pokemon.setDoces(pokemon.getDoces() + 10);
        nivel += 2;
    }
    
    void evoluirPokemon(Pokemon pokemon, String nomeEvolucao){
        if(pokemon.getDoces() >= 50){
            String nomeAntigo = pokemon.getNome();
            pokemon.setNome(nomeEvolucao);
            pokemon.setDoces(pokemon.getDoces() - 50);
            nivel += 10;
            
            String frase = "Pokémon %s evoluiu para -> %s";
            System.out.println(String.format(frase, nomeAntigo, pokemon.getNome()));
        } else {
            System.out.println("Não foi possível realizar a operação");
        }
    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }
    
    
}
