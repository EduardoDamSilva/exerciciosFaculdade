/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.exemplo.classe.abstrata;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Mecanica {
    
    private String nome;
    private List<Veiculo> veiculosClientes;

    public Mecanica(String nome) {
        this.nome = nome;
        this.veiculosClientes = new ArrayList();
    }
    
    public void adicionarVeiculoCliente(Veiculo v){
        veiculosClientes.add(v);
    }
    
    public void exibirRelatorioTodosClientes(){
        for(Veiculo veiculoCliente : veiculosClientes){
            veiculoCliente.relatorioDeRevisao();
        }
    }
}
