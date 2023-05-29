/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac2.segunda.atividade.listas;

import eduardo.ac2.segunda.atividade.Atividade;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eduardo
 */
public class TesteLista {
    public static void main(String[] args) {
        //Utilizaremos a classe ArrayList,
        //pois ela possui vários métodos que ajudam
        // Mas pra isso, criamos um objeto
        
        // Métodos mais usados:
        // add: adicionar um objeto na lista
        // size: retorna o tamanho da lista
        // get: busca o elemento por indice ou objeto
        // remove: remove por indice ou objeto
        
        // Ela é estranha por que aceita qualquer tipo
        List listaEstranha = new ArrayList();
        
        listaEstranha.add("Manoel");
        listaEstranha.add(42);
        listaEstranha.add(42.0);
        listaEstranha.add(false);
        
        System.out.println(listaEstranha);
        
        //Lista de String
        List<String> nomesUsuarios = new ArrayList<>();
        nomesUsuarios.add("Bob");
        nomesUsuarios.add("Gustavo");
        nomesUsuarios.add("Matheus");
        nomesUsuarios.add("Cristhian");
        nomesUsuarios.add("Pedro");
        
        System.out.println(nomesUsuarios);
        
        //Buscando o nome da 3º posição
        String terceiroNome = nomesUsuarios.get(2);
        System.out.println("Terceiro nome: " + terceiroNome);
        
        for(int i = 0; i < nomesUsuarios.size(); i++){
            System.out.println(String.format("%d da lista: %s", i, nomesUsuarios.get(i)));
        }
        
        // Removendo o Gustavo:
        // nomesUsuarios.remove("Gustavo"); // -> Retira todos os "Gustavo"s da lista
        // OU
        nomesUsuarios.remove(1); //Dê preferência para esse
        
        //Criando listas de objetos:
        List<Atividade> atividades = new ArrayList();
        
        Atividade atv1 = new Atividade("Open Lab", "Eduardo", 1);
        Atividade atv2 = new Atividade("Tela Swing Java", "Eduardo", 7);
        Atividade atv3 = new Atividade("Slide sobre a Metodologia", "Eduardo", 7);
        
        atividades.add(atv1);
        atividades.add(atv2);
        atividades.add(atv3);
        
        System.out.println("Atividades da lista: ");
        for (int i = 0; i < atividades.size(); i++){
            Atividade atividadeDaVez = atividades.get(i);
            
            if(atividadeDaVez.getDiasEstimados() < 7){
                  System.out.println(atividadeDaVez);
            }
            
            
        }
        // Enchanced for
        for (Atividade atividadeDaVez : atividades) {
            if(atividadeDaVez.getDiasEstimados() < 7){
                  System.out.println(atividadeDaVez);
            }
        }
    }
    
        
}
