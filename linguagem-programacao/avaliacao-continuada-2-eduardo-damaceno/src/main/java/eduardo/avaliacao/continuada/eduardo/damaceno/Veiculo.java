/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.avaliacao.continuada.eduardo.damaceno;

/**
 *
 * @author eduardo
 */
public class Veiculo {
    
    private Integer id;
    private String modelo;
    private Double valorTabela;
    private Integer quantidadeEstoque;
    
    public Veiculo(Integer id, String modelo){
        this.id = id;
        this.modelo = modelo;
        valorTabela = 0.0;
        quantidadeEstoque = 0;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getValorTabela() {
        return valorTabela;
    }

    public void setValorTabela(Double valorTabela) {
        this.valorTabela = valorTabela;
        System.out.println("Valor atual da tabela agora é de: " + valorTabela);
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
        System.out.println("Quantidade em estoque agora é de: " + quantidadeEstoque);
    }

    @Override
    public String toString() {
        String frase = String.format("Veiculo: \n"
                + "Id = %d \n"
                + "Modelo = %s \n"
                + "Valor da tabela = %.2f \n"
                + "Qtd em estoque = %d \n", id, modelo, valorTabela, quantidadeEstoque);
        
        return frase;
    }
    
    
}
