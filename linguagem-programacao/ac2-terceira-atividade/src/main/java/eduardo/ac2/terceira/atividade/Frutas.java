/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac2.terceira.atividade;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Frutas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome de uma fruta:");
        String frutaAdivinhada = sc.nextLine();
        
        List<String> frutas = new ArrayList();
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Abacaxi");
        frutas.add("Melão");
        frutas.add("Goiaba");
        
        Boolean frutaExiste = true;
        for (String fruta : frutas) {  
            if(fruta.equals(frutaAdivinhada)){
                frutaExiste = true;
                System.out.println("Achou");
            }
        }
        
        if(frutaExiste == true){
            System.out.println("A fruta " + frutaAdivinhada + " existe na lista");
        } else {
            System.out.println("Não existe a fruta " + frutaAdivinhada + " na lista");
        }
        
        
    }
}
