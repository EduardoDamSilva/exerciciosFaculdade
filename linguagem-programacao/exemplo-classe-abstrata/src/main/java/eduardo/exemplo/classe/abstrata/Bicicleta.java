/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.exemplo.classe.abstrata;

/**
 *
 * @author eduardo
 */
public class Bicicleta extends Veiculo{
    
    private Integer calibragemPneus;
    private Double pesoCiclista;

    public Bicicleta(Integer calibragemPneus, Double pesoCiclista, String proprietario, String marca, Integer anoFabricacao) {
        super(proprietario, marca, anoFabricacao);
        this.calibragemPneus = calibragemPneus;
        this.pesoCiclista = pesoCiclista;
    }

    @Override
    public void relatorioDeRevisao() {
        System.out.println("Relatório da bike do cliente: " + proprietario);
        if(pesoCiclista.equals(60.1) && calibragemPneus < 15){
            System.out.println("Precisa calibrar o Pneu");
        } else {
            System.out.println("Calibragem ok!");
        }
    }
    
    
    
    public Integer getCalibragemPneus() {
        return calibragemPneus;
    }

    public void setCalibragemPneus(Integer calibragemPneus) {
        this.calibragemPneus = calibragemPneus;
    }

    public Double getPesoCiclista() {
        return pesoCiclista;
    }

    public void setPesoCiclista(Double pesoCiclista) {
        this.pesoCiclista = pesoCiclista;
    }
    
    
}
