/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac.atividade3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class EscolaVirtual {
    
    private String nome;
    private Integer vagas;
    private List<Professor> professores;

    public EscolaVirtual(String nome, Integer vagas) {
        this.nome = nome;
        this.vagas = vagas;
        this.professores = new ArrayList();
    }
    
    public void contratarProfessor(Professor prof){
        if(vagas >= 1){
            professores.add(prof);
        } else {
            System.out.println("A escola virtual "+ nome +" não possuí vagas disponíveis");
        }
    }
    
    public void exibirTodos(){
        if(professores.size() >= 0){
            System.out.println(professores);
        } else {
            System.out.println("A escola virtual" + nome + "não possuí vagas disponíveis");
        }
    }
    
    public void exibePalestrantes(){
        if(professores.size() >= 0){
            for(Professor professor : professores){
                if(professor instanceof Palestrante){
                    System.out.println(professor);
                }
            }
        }
    }
    
    public void exibeFolhaDePagamento(){
        Double totalASerPago = 0.0;
        for(Professor professor : professores){
            System.out.println(professor);
            totalASerPago += professor.calcularGanho();
        }
        System.out.println("Total professores: " + professores.size());
    }
    
    public void atualizarValorCurso(String nomeCurso, Double valorNovo ){
        Boolean cursoExiste = false;
        for(Professor professor : professores){
            if(professor.getCurso().equals(nomeCurso)){
                professor.setValorCurso(valorNovo);
                cursoExiste = true;
            }
        }
        
        if(!cursoExiste){
            System.out.println("Curso inexistente");
        }
    }
    
    public Professor buscaProfessor(String nome){
        Professor professorEncontrado = new Professor();
        for (Professor professor : professores){
            if(professor.getNome().equals(nome)){
                professorEncontrado = professor;
            }
        }
        return professorEncontrado;
    }

    @Override
    public String toString() {
        String frase = String.format("Escola Virtual:"
                + "\nNome: %s"
                + "\nVagas Restantes: %d"
                + "\nProfessores: %s"
                + "\nVagas: %d", nome, vagas, professores);
        
        return "EscolaVirtual{" + "nome=" + nome + ", vagas=" + vagas + ", professores=" + professores + '}';
    }
    
    
}
