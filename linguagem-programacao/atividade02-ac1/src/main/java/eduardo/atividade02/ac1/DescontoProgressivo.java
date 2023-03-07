/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.atividade02.ac1;

/**
 *
 * @author eduardo
 */
public class DescontoProgressivo {
    Double calcularDesconto(Double valorUnid, Double qtd){
        Double total = valorUnid * qtd;
        
        Double desconto;
        if (qtd == 1.0){
            desconto = 0.9;
        } else if (qtd == 2.0){
            desconto = 0.8;
        } else {
            desconto = 0.7;
        }
        
        return total * desconto;
            
    }
    
    void exibirNotaFiscal(Double valorUnid, Double qtd){
        Double valorComDesconto = calcularDesconto(valorUnid, qtd);
        System.out.println("-------------------------------");
        System.out.println(String.format("Valor do produto: R$%.2f", valorUnid));
        System.out.println(String.format("Quantidade: %.0f", qtd));
        System.out.println("-------------------------------");
        System.out.println(String.format("Valor com desconto: R$%.2f", valorComDesconto));
    }
}
