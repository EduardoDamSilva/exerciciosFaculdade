/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.classe.abstrata.funcionario;

/**
 *
 * @author eduardo
 */
public class Vendedor extends Funcionario{
    
    private Double vendas;
    private Double taxas;

    public Vendedor(Double vendas, Double taxas, String cpf, String nome) {
        super(cpf, nome);
        this.vendas = vendas;
        this.taxas = taxas;
    }


    @Override
    public Double calcSalario() {
        return vendas * taxas;
    }

    public Double getVendas() {
        return vendas;
    }

    public void setVendas(Double vendas) {
        this.vendas = vendas;
    }

    public Double getTaxas() {
        return taxas;
    }

    public void setTaxas(Double taxas) {
        this.taxas = taxas;
    }

    @Override
    public String toString() {
        String frase = String.format("Vendedor: \n"
                + "Vendas: %.2f \n"
                + "Taxas: %.2f", vendas, taxas);
        
        return frase;
    }
    
    
}
