/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.exemplo.classe.abstrata;

/**
 *
 * @author eduardo
 */
public class TesteMecanica {
    public static void main(String[] args) {
        Veiculo v01 = new Bicicleta(10, 60.5, "Eduardo", "Java", 2022 );
        Veiculo v02 = new Carro(false, 1.5,"Eduardo", "JS", 2022);
        
        Mecanica mecanica = new Mecanica("Dois Irmãos");
        
        v01.relatorioDeRevisao();
        v02.relatorioDeRevisao();
        
        mecanica.adicionarVeiculoCliente(v01);
        mecanica.adicionarVeiculoCliente(v02);
        
        
    }
}

