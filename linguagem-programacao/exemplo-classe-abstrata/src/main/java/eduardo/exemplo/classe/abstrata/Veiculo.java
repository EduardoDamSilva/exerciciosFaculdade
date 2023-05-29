/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.exemplo.classe.abstrata;

import java.time.LocalDate;

/**
 *
 * @author eduardo
 */
public abstract class Veiculo {
    protected String proprietario;
    protected String marca;
    protected Integer anoFabricacao;

    public Veiculo(String proprietario, String marca, Integer anoFabricacao) {
        this.proprietario = proprietario;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }
    
    public abstract void relatorioDeRevisao();
    
    public Integer calcularTempoUso(){
        return LocalDate.now().getYear() - anoFabricacao;
    }
    
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    
    
}
