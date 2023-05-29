/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac2.segunda.atividade;

/**
 *
 * @author eduardo
 */
public class PetShop {
    
    private String nome;
    private Double faturamentoTotal;

    public PetShop(String nome) {
        this.nome = nome;
        faturamentoTotal = 0.0;
    }

    public void darBanho(Pet pet, Double valor){
        faturamentoTotal += valor;
        pet.setQtdVisitaAoPetShop(pet.getQtdVisitaAoPetShop() + 1);
        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + valor);
        System.out.println("Banho tomado com sucesso, valor: " + valor);
    }
    
    public void darBanho(Pet pet, Double valor, Integer desconto){
        Double total = valor * (1.0 - desconto / 100.0);
        faturamentoTotal += total;
        pet.setQtdVisitaAoPetShop(pet.getQtdVisitaAoPetShop() + 1);
        pet.setValorGastoEmPetShop(pet.getValorGastoEmPetShop() + total);
        System.out.println("Banho tomado com sucesso, valor: " + total);
        
    }

    public String getNome() {
        return nome;
    }

    public Double getFaturamentoTotal() {
        return faturamentoTotal;
    }
    
    @Override
    public String toString() {
        String frase = String.format(
                "PetShop: \n"
                + "Nome: %s \n"
                + "Faturamento total: %.2f", nome, faturamentoTotal
        );
        
        return frase;
    }
    
}
