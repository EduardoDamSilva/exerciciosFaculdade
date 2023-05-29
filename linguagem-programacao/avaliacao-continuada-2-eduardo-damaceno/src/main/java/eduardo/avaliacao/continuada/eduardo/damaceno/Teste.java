/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.avaliacao.continuada.eduardo.damaceno;

/**
 *
 * @author eduardo
 */
public class Teste {
    public static void main(String[] args) {
        
        Concessionaria con = new Concessionaria("AutoCar");
        Veiculo veiculo1 = new Veiculo(1, "Onix");
        Veiculo veiculo2 = new Veiculo(2, "Lamborguini");
        Veiculo veiculo3 = new Veiculo(3, "Tracker");
        Veiculo veiculo4 = new Veiculo(4, "Corola");
        
        System.out.println(veiculo1);
        System.out.println(veiculo2);
        System.out.println(veiculo3);
        System.out.println(veiculo4);
        
        veiculo1.setValorTabela(50000.0);
        veiculo2.setValorTabela(500000.0);
        veiculo3.setValorTabela(140000.0);
        veiculo4.setValorTabela(14000.0);
        
        veiculo1.setQuantidadeEstoque(10);
        veiculo2.setQuantidadeEstoque(1);
        veiculo3.setQuantidadeEstoque(5);
        veiculo4.setQuantidadeEstoque(0);
        
        con.aumentarEstoque(veiculo4, 2);
        con.aumentarEstoque(veiculo3, 2);
        
        System.out.println(con.getPercentualVendasComDesconto());
        con.realizarVenda(veiculo3, 20.0);
        System.out.println(con.getPercentualVendasComDesconto());
        System.out.println(con);
        
        
        con.realizarVenda(veiculo3);
        System.out.println(con.getPercentualVendasComDesconto());
        
        
        System.out.println(con);
    }
}
