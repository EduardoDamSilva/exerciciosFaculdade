/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac2.segunda.atividade;

/**
 *
 * @author eduardo
 */
public class Pet {
    
    private String nome;
    private String raca;
    private Integer qtdVisitaAoPetShop;
    private Double valorGastoEmPetShop;

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
        qtdVisitaAoPetShop = 0;
        valorGastoEmPetShop = 0.0;
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Integer getQtdVisitaAoPetShop() {
        return qtdVisitaAoPetShop;
    }

    public void setQtdVisitaAoPetShop(Integer qtdVisitaAoPetShop) {
        this.qtdVisitaAoPetShop = qtdVisitaAoPetShop;
    }
    
    public Double getValorGastoEmPetShop(){
        return valorGastoEmPetShop;
    }

    public void setValorGastoEmPetShop(Double valorGastoEmPetShop) {
        this.valorGastoEmPetShop = valorGastoEmPetShop;
    }
    
    
    
    @Override
    public String toString() {
        String frase = String.format(
                "Pet: \n"
                + "Nome: %s\n"
                + "Raca: %s\n"
                + "Qtd visitas ao PetShop: %d \n"
                + "Valor gasto em PetShop: %.2f\n", nome, raca, qtdVisitaAoPetShop, valorGastoEmPetShop);
        
        return frase;
    }
    
    
}
