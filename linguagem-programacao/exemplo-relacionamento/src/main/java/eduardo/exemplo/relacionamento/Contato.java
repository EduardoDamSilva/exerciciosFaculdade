/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.exemplo.relacionamento;

/**
 *
 * @author eduardo
 */
public class Contato {
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.bloqueado = false;
    }
    
    public void bloquear(){
        bloqueado = true;
    }
    
    public void desbloquear(){
        bloqueado = false;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        String fraseBloq = bloqueado ? "Sim" : "Não";
        
        return String.format("\nContato: "
                + "\nNome: %s"
                + "\nTelefone %s"
                + "\nBloqueado: %s", nome, telefone, fraseBloq);
    }

    
}
