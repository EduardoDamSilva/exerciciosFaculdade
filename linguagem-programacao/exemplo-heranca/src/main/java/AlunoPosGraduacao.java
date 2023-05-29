/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
public class AlunoPosGraduacao extends Aluno{

    private Double notaTcc;
    private Double notaArtigo;

    public AlunoPosGraduacao(Double notaTcc, Double notaArtigo, String ra, String nome, Double nota01, Double nota02) {
        // Construtor não é herdado e sim chamado, pois o construtor tem o nome da classe
        super(ra, nome, nota01, nota02);
        this.ra = ra;
        this.nome = nome;
        this.nota01 = nota01;
        this.nota02 = nota02;
        this.notaTcc = notaTcc;
        this.notaArtigo = notaArtigo;
    }
    
    @Override
    public Double calcularMedia() {
        return (nota01 + nota02 + notaArtigo + notaTcc) / 4.0;
    }

    public Double getNotaTcc() {
        return notaTcc;
    }

    public void setNotaTcc(Double notaTcc) {
        this.notaTcc = notaTcc;
    }

    public Double getNotaArtigo() {
        return notaArtigo;
    }

    public void setNotaArtigo(Double notaArtigo) {
        this.notaArtigo = notaArtigo;
    }

    @Override
    public String toString() {
        return String.format("%s"
                + "\nNota Artigo: %1.f"
                + "\nNota TCC: %.1f", super.toString(), notaArtigo, notaTcc);
    }

    
    
    
}
