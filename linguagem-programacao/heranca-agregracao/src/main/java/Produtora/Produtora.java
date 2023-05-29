/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtora;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Produtora {

    private String nome;
    private Integer vagas;
    private List<Ator> atores;

    public Produtora(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.atores = new ArrayList();
    }

    public Boolean existePorNome(String nome) {
        for (Ator dev : atores) {
            if (dev.getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }

    public void contratar(Ator a) {
        if (vagas > 0) {
            atores.add(a);
        } else {
            System.out.println("Sem vagas disponíveis!");
        }
    }

    public Integer getQuantidadeAtores() {
        Integer totalAtores = 0;
        for (Ator ator : atores) {
            totalAtores++;
        }
        return totalAtores;
    }

    public Integer getQuantidadeProtagonistas() {
        Integer totalDesenvolvedoresMobile = 0;
        for (Ator ator : atores) {
            if (ator instanceof Protagonista) {
                totalDesenvolvedoresMobile++;
            }

        }
        return totalDesenvolvedoresMobile;
    }

    public Double getTotalSalarios() {
        Double totalSalarios = 0.0;
        for (Ator dev : atores) {
            totalSalarios += dev.getSalario();
        }

        return totalSalarios;
    }

    public Ator buscarAtorPorNome(String nome) {
        Ator atorEncontrado = new Ator();
        for (Ator ator : atores) {
            if (ator.getNome().equalsIgnoreCase(nome)) {
                atorEncontrado = ator;
            }
        }
        return atorEncontrado;
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

    public List<Ator> getAtores() {
        return atores;
    }

    @Override
    public String toString() {
        String frase = String.format("Consultoria:"
                + "\nNome: %s"
                + "\nVagas: %d"
                + "\nDesenvolvedores: %s", nome, vagas, atores);

        return frase;
    }
}
