/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.introducao.poo;

/**
 *
 * @author eduardo
 */
public class Encomendas {
    
    String tamanho;
    String enderecoRemetente;
    String enderecoDestinatario;
    Double distancia;
    Double valorEncomenda;
    
    Double calcularFrete() {
        Double frete = 0.0;
        if (tamanho.equals("Pequeno")){
            frete += valorEncomenda * 0.01;
        } else if (tamanho.equals("Médio")){
            frete += valorEncomenda * 0.03;
        } else if (tamanho.equals("Grande")){
            frete += valorEncomenda * 0.05;
        } else {
            System.out.println("Tamanho incorreto!");
        }
        
        if (distancia <= 50){
            frete += 3.0;
        } else if (distancia <= 200){
            frete += 5.0;
        } else {
            frete += 7.0;
        }
        
        return frete;
    }
    
    void emitirEtiqueta(){
        
        System.out.println(
                String.format("****ETIQUETA PARA O ENVIO**** \n"
                + "Endereço do remetente: %s \n"
                + "Endereço do destinatário: %s \n"
                + "Tamanho: %s \n"
                + "----------------------------- \n"
                + "Valor encomenda: R$ %.2f \n"
                + "Valor frete: R$ %.2f \n"
                + "----------------------------- \n"
                + "Valor total: R$ %.2f", enderecoRemetente, enderecoDestinatario, tamanho, valorEncomenda, calcularFrete(), (calcularFrete() + valorEncomenda)));
    }
    
}
