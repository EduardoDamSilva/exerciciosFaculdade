/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.heranca.agregracao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Consultoria {
    
    private String nome;
    private Integer vagas;
    private List<Desenvolvedor> desenvolvedores;

    public Consultoria(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.desenvolvedores = new ArrayList();
    }
    
    
    
    public Boolean existePorNome(String nome){
        for(Desenvolvedor dev : desenvolvedores){
            if(dev.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }
        return false;
    }
    
    public void contratar(Desenvolvedor d){
        if(vagas > 0){
            desenvolvedores.add(d);
        } else {
            System.out.println("Sem vagas disponíveis!");
        }
    }
    
    public Integer getQuantidadeDesenvolvedor(){
        Integer totalDesenvolvedores = 0;
        for(Desenvolvedor dev : desenvolvedores){
            totalDesenvolvedores++;
        }
        return totalDesenvolvedores;
    }
    
    public Integer getQuantidadeDesenvolvedorMobile(){
        Integer totalDesenvolvedoresMobile = 0;
        for(Desenvolvedor dev : desenvolvedores){
            if(dev instanceof DesenvolvedorMobile){
                totalDesenvolvedoresMobile++;
            }
            
        }
        return totalDesenvolvedoresMobile;
    }
    
    public Double getTotalSalarios(){
        Double totalSalarios = 0.0;
        for(Desenvolvedor dev : desenvolvedores){
            totalSalarios += dev.getSalario();
        }
        
        return totalSalarios;
    }
    
    public Desenvolvedor buscarDesenvolvedorPorNome(String nome){
        Desenvolvedor devEncontrado = new Desenvolvedor();
        for(Desenvolvedor dev : desenvolvedores){
            if(dev.getNome().equalsIgnoreCase(nome)){
                devEncontrado = dev;
            }
        }
        return devEncontrado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public List<Desenvolvedor> getDesenvolvedores() {
        return desenvolvedores;
    }

    @Override
    public String toString() {
        String frase = String.format("Consultoria:"
                + "\nNome: %s"
                + "\nVagas: %d"
                + "\nDesenvolvedores: %s", nome, vagas, desenvolvedores);
        
        return frase;
    }
    
    
}
