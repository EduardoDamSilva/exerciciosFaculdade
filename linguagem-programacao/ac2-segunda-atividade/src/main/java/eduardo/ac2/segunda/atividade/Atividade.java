/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac2.segunda.atividade;

/**
 *
 * @author eduardo
 */
public class Atividade {
    
    private String nomeAtividade;
    private String responsavel;
    private Integer diasEstimados;
    private Integer diasUsados;

    public Atividade(String nomeAtividade, String responsavel, Integer diasEstimados) {
        this.nomeAtividade = nomeAtividade;
        this.responsavel = responsavel;
        this.diasEstimados = diasEstimados;
        diasUsados = 0;
    }
    
    public void terminarAtividade(Integer diasUsados){
        this.diasUsados = diasUsados;
        System.out.println("Atividade completa!");
    }
    
    public void exibirRelatorio(){
        Integer diferencaDias = diasEstimados - diasUsados;
        
        
        if (diasEstimados < diasUsados){
            String frase = String.format( "Você estimou %d dias, mas a tarefa foi "
                    + "feita em %d dias (%d dias a mais que o estimado). "
                    + "Melhore a estimativa.", diasEstimados, diasUsados, (diferencaDias * -1));
            System.out.println(frase);
        } else if (diasEstimados > diasUsados){
            String frase = String.format( "Você estimou %d dias, e a tarefa foi "
                    + "feita em %d dias (%d dias a menos que o estimado). "
                    + "Parabéns!", diasEstimados, diasUsados, diferencaDias);
            System.out.println(frase);
        } else {
            String frase = String.format( "Você estimou %d dias, e a tarefa foi "
                    + "feita em %d dias atendendo a estimativa com precisão",
                    diasEstimados, diasUsados, diferencaDias);
            System.out.println(frase);
        }
    }

    

    public String getNomeAtividade() {
        return nomeAtividade;
    }

    public void setNomeAtividade(String nomeAtividade) {
        this.nomeAtividade = nomeAtividade;
    }

    public String getReponsavel() {
        return responsavel;
    }

    public void setReponsavel(String reponsavel) {
        this.responsavel = reponsavel;
    }

    public Integer getDiasEstimados() {
        return diasEstimados;
    }

    public void setDiasEstimados(Integer diasEstimados) {
        this.diasEstimados = diasEstimados;
    }

    public Integer getDiasUsados() {
        return diasUsados;
    }

    public void setDiasUsados(Integer diasUsados) {
        this.diasUsados = diasUsados;
    }
    
    @Override
    public String toString() {
        String frase = String.format("Atividade \n"
                + "Nome atividade: %s\n"
                + "Responsável: %s\n"
                + "Dias estimados: %d\n"
                + "Dias usados: %d", nomeAtividade, responsavel, diasEstimados, diasUsados);
        
        return frase;
    }
}
