/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.relacionamento.carrinho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Carrinho {
    private String cliente;
    private List<Produto> produtos;

    public Carrinho(String cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList();
    }
    
    public Integer getQuantidade(){
        return produtos.size();
    }
    
    public void adicionar(Produto p){
        produtos.add(p);
    }
    
    public Boolean existPorNome(String nome){
        if(produtos.indexOf(nome) == -1){
            return false;
        } else {
            return true;
        }
    }
    
    public Integer getQuantidadePorCategoria(String categoria){
        Integer qtdProduto = 0;
        for (Produto produto: produtos){
            if(produto.getCategoria().equals(categoria)){
                qtdProduto++;
            }
        }
        return qtdProduto;
    }
    
    
    public void limpar(){
        produtos.removeAll(produtos);
    }
    
    public void removePorNome(String nome){
        for(Produto produto: produtos){
            if(produto.getNome().equals(nome)){
                produtos.remove(produto);
            }
        }
    }
    
    public Produto getPorNome(String nome){
        Produto produtoEncontrado = new Produto();
        for(Produto produto: produtos){
           if(produto.getNome().equals(nome)){
                return produtoEncontrado;
            } 
        }
        return produtoEncontrado;
    }
    
    public Double getValorTota(){
        Double total = 0.0;
        for(Produto produto: produtos){
            total += produto.getPreco();
        }
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return String.format("Carrinho:"
                + "\n Cliente: %s"
                + "\n Produtos: %s", cliente, produtos);
    }

    
}
