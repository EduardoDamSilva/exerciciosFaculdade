/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.desafio.conta.corrente;

/**
 *
 * @author eduardo
 */
public class Historico {

    private Integer dia;
    private Integer mes;
    private Integer ano;
    private Double valor;
    private String operacao;

    public Historico(Integer dia, Integer mes, Integer ano, Double valor, String operacao) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.valor = valor;
        this.operacao = operacao;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    @Override
    public String toString() {
        String.format(
                "Operação: %s \n"
                + "Valor: %.2f\n"
                + "Dia: %d\n"
                + "Mês: %d\n"
                + "Ano: %d\n", operacao, valor, dia, mes, ano);
        
        return String.format(
                "Operação: %s \n"
                + "Valor: %.2f\n"
                + "Dia: %d\n"
                + "Mês: %d\n"
                + "Ano: %d\n", operacao, valor, dia, mes, ano);
    }

}
