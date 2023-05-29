/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.matheus.heranca;

/**
 *
 * @author eduardo
 */
public class Cozinha {
    
    private Integer qtdPratosSujos;
    private Boolean cozinhaLimpa;

    public Cozinha() {
        this.qtdPratosSujos = 0;
        this.cozinhaLimpa = true;
    }

    public Integer getQtdPratosSujos() {
        return qtdPratosSujos;
    }

    public void setQtdPratosSujos(Integer qtdPratosSujos) {
        this.qtdPratosSujos = qtdPratosSujos;
    }

    public Boolean getCozinhaLimpa() {
        return cozinhaLimpa;
    }

    public void setCozinhaLimpa(Boolean cozinhaLimpa) {
        this.cozinhaLimpa = cozinhaLimpa;
    }

    @Override
    public String toString() {
        
        String textoEstadoCozinha;
        if(getCozinhaLimpa()){
            textoEstadoCozinha = "Está Limpa!";
        } else {
            textoEstadoCozinha = "Está Suja!";
        }
        
        String frase = String.format("Cozinha:"
                + "\nQuantidade de pratos sujos: %d"
                + "\nCozinha limpa: %s", qtdPratosSujos, textoEstadoCozinha);
        
        return frase;
    }
    
    
}
