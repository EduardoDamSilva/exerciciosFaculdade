/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.avaliacao.continuada.eduardo.damaceno;

/**
 *
 * @author eduardo
 */
public class Concessionaria {
    
    private String nome;
    private Integer quantidadeVendas;
    private Integer quantidadeDescontosAplicados;
    private Double totalVendido;

    public Concessionaria(String nome) {
        this.nome = nome;
        quantidadeVendas = 0;
        quantidadeDescontosAplicados = 0;
        totalVendido = 0.0;
    }
    
    public void aumentarEstoque(Veiculo veiculo, Integer quantidade){
        if(quantidade > 0){
            veiculo.setQuantidadeEstoque(veiculo.getQuantidadeEstoque() + quantidade) ;
            System.out.println("Aumentado o estoque em : " + veiculo.getQuantidadeEstoque());
        } else {
            System.out.println("Falha ao aumentar estoque");
        }
    }
    
    public void realizarVenda(Veiculo veiculo){
        if(veiculo.getQuantidadeEstoque() > 0 && veiculo.getValorTabela() > 0){
            veiculo.setQuantidadeEstoque(veiculo.getQuantidadeEstoque() - 1);
            totalVendido += veiculo.getValorTabela();
            quantidadeVendas++;
            System.out.println("Venda realizada!");
        } else {
            System.out.println("Falha ao realizar venda");
        }
    }
    
    public void realizarVenda(Veiculo veiculo, Double porcentagemDesconto){
        if(veiculo.getQuantidadeEstoque() > 0 && veiculo.getValorTabela() > 0 && porcentagemDesconto > 0){
            
            veiculo.setQuantidadeEstoque(veiculo.getQuantidadeEstoque() - 1);
            Double valorVendaComDesconto = veiculo.getValorTabela() - (veiculo.getValorTabela() * (porcentagemDesconto / 100));
            totalVendido += valorVendaComDesconto;
            quantidadeVendas++;
            quantidadeDescontosAplicados++;
            System.out.println("Venda com desconto realizada com sucesso!");
            
        } else {
            System.out.println("Falha ao realizar venda com desconto");
        }
    
    }
    
    public Double getPercentualVendasComDesconto(){
        if (totalVendido > 0){
            Double descontosAplicados = (quantidadeDescontosAplicados.doubleValue() * 100.0) / quantidadeVendas.doubleValue();
            return descontosAplicados;
        } else if (totalVendido > 0 && quantidadeVendas == quantidadeDescontosAplicados){
            return 100.0;
        }
    return 0.0;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public Integer getQuantidadeDescontosAplicados() {
        return quantidadeDescontosAplicados;
    }

    public Double getTotalVendido() {
        return totalVendido;
    }

    @Override
    public String toString() {
        String frase = String.format("Concessionaria: \n"
                + "Nome = %s \n"
                + "Quantidade de vendas = %d \n"
                + "Quantidade de decontos aplicados = %d \n"
                + "Total vendido = %.2f", nome, quantidadeVendas, quantidadeDescontosAplicados, totalVendido);
        
        return frase;
    }
    
    
}
