/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.banco.de.dados;

/**
 *
 * @author eduardo
 */
public class Filme {
    
    private Integer id;
    private String nome;
    private Integer anoLancamento;



    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
    @Override
    public String toString() {
        return "\nFilme{" + "id=" + id + ", nome=" + nome + ", anoLancamento=" + anoLancamento + '}';
    }

}
