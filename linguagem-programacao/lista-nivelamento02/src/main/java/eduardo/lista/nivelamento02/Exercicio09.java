/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.nivelamento02;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Exercicio09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Integer votosMussarela = 0;
        Integer votosCalabresa = 0;
        Integer votosQuatroQueijos = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Insira o seu sabor favorito de pizza com um número, sendo eles: \n"
                    + "5 -> Mussarela \n"
                    + "25 -> Calabresa \n"
                    + "50 -> Quatro Queijos");
            Integer numeroSaborPizza = sc.nextInt();
            
            switch(numeroSaborPizza){
                case 5:
                    votosMussarela++;
                    break;
                case 25:
                    votosCalabresa++;
                    break;
                case 50:
                    votosQuatroQueijos++;
                    break;
            }
        }
        
        String saborFavorito;
        if(votosMussarela > votosCalabresa && votosMussarela > votosQuatroQueijos){
            saborFavorito = "Mussarela";
        } else if (votosCalabresa > votosQuatroQueijos){
            saborFavorito = "Calabresa";
        } else{
            saborFavorito = "Quatro Queijos";
        }
        
        System.out.println(String.format(
                "Mussarela: %d \n"
                        + "Calabresa: %d \n"
                        + "Quatro Queijos: %d \n"
                        + "Sabor Favorito = %s", 
                votosMussarela, votosCalabresa, votosQuatroQueijos, saborFavorito)
        );
    }
}
