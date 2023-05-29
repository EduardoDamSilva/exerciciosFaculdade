/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
public class Teste {
    public static void main(String[] args) {
        Aluno alunoComum = new Aluno("123", "Marcos", 5.0, 2.0);
        AlunoPosGraduacao alunoPos = new AlunoPosGraduacao(10.0, 10.0, "12", "Eduardo", 10.0, 10.0);
        System.out.println("Média comum: " + alunoComum.calcularMedia());
        System.out.println("Média pós: " + alunoPos.calcularMedia());
        
        Faculdade faculdade = new Faculdade("SPTech");
        faculdade.matricular(alunoComum);
        faculdade.matricular(alunoPos);
        System.out.println(faculdade);
    }
}
