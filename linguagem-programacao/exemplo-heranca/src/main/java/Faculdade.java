
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
public class Faculdade {
    private String nome;
    private List<Aluno> alunos;

    public Faculdade(String nome) {
        this.nome = nome;
        this.alunos = new ArrayList();
    }
    
    public void matricular(Aluno alunoMatricula){
        alunos.add(alunoMatricula);
    }
    
    public void exibirAlunos(){
        for (Aluno aluno : alunos){
            System.out.println(aluno);
        }
    }
    
    public void exibirAlunosPos(){
        for (Aluno aluno : alunos){
            if(aluno instanceof AlunoPosGraduacao)
            System.out.println(aluno);
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    @Override
    public String toString() {   
        return "Faculdade{" + "nome=" + nome + ", alunos=" + alunos + '}';
    }
}
