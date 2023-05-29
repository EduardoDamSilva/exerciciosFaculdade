/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtora;

/**
 *
 * @author eduardo
 */
public class Protagonista extends Ator{
    private Integer qtdHorasTrabalhadasMobile;
    private Double valorHoraTrabalhadaMobile;

    public Protagonista(Integer qtdHorasTrabalhadasMobile, Double valorHoraTrabalhadaMobile, String nome) {
        super.nome = nome;
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public Double getSalario() {
        return qtdHorasTrabalhadasMobile * valorHoraTrabalhadaMobile;
    }

    public Integer getQtdHorasTrabalhadasMobile() {
        return qtdHorasTrabalhadasMobile;
    }

    public void setQtdHorasTrabalhadasMobile(Integer qtdHorasTrabalhadasMobile) {
        this.qtdHorasTrabalhadasMobile = qtdHorasTrabalhadasMobile;
    }

    public Double getValorHoraTrabalhadaMobile() {
        return valorHoraTrabalhadaMobile;
    }

    public void setValorHoraTrabalhadaMobile(Double valorHoraTrabalhadaMobile) {
        this.valorHoraTrabalhadaMobile = valorHoraTrabalhadaMobile;
    }

    @Override
    public String toString() {
        String frase = String.format("Desenvolvedor:"
                + "\nNome: %s"
                + "\nQuantidade horas trabalhadas: %d"
                + "\nValor horas trabalhadas: %.2f"
                + "\nSalario: %.2f", nome, qtdHorasTrabalhadasMobile, valorHoraTrabalhadaMobile, this.getSalario());
        return frase;
    } 
}
