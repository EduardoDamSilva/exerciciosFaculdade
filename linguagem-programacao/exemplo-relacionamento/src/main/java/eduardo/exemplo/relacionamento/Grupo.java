/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.exemplo.relacionamento;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        this.contatos = new ArrayList();
    }
    
    public void adicionar(Contato c){
        contatos.add(c);
    }
    
    public void remover(Contato c){
        contatos.remove(c);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    @Override
    public String toString() {
        return String.format(
                "Nome do Grupo: %s"
              + "\nContatos do grupo: %s", nome, contatos);
    }
    
    
}
