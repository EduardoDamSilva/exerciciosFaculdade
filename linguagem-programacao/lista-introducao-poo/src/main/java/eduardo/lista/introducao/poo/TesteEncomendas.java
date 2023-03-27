/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.introducao.poo;

/**
 *
 * @author eduardo
 */
public class TesteEncomendas {
    public static void main(String[] args) {
        
        Encomendas encomenda1 = new Encomendas();
        encomenda1.valorEncomenda = 100.0;
        encomenda1.enderecoDestinatario = "Rua José da Silva, 55";
        encomenda1.enderecoRemetente = "Avenida Paulista, 1000";
        encomenda1.tamanho = "Médio";
        encomenda1.distancia = 70.0;
        
        encomenda1.emitirEtiqueta();
         
    }
}
