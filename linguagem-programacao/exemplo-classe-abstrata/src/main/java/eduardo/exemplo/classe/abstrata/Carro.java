/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.exemplo.classe.abstrata;

/**
 *
 * @author eduardo
 */
public class Carro extends Veiculo{
    
    private Boolean possuiEstepe;
    private Double nivelOleo;

    public Carro(Boolean possuiEstepe, Double nivelOleo, String proprietario, String marca, Integer anoFabricacao) {
        super(proprietario, marca, anoFabricacao);
        this.possuiEstepe = possuiEstepe;
        this.nivelOleo = nivelOleo;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Relatório do carro do cliente: " + proprietario);
        if(possuiEstepe){
            System.out.println("Estepe ok!");
        } else {
            System.out.println("Compre um estepe conosco");
        }
        
        if(nivelOleo < 1.0){
            System.out.println("Compre óleo conosco!");
        }else{
            System.out.println("Óleo ok!");
        }
    }
    
    
    
    
}
