/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.projeto.individual;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class ProjetoIndividual {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Integer numeroOperacao;
        do{
            System.out.println(
                    "Digite o número correspondente a operação desejada:\n"
                            + "1 - Calculo de Armadura\n" 
                            + "2 - Multiplicação\n" 
                            + "3 - Divisão\n" 
                            + "4 - Subtração\n"
                            + "5 - Potência\n"
                            + "0 - Sair"
            );
            numeroOperacao = sc.nextInt();
            System.out.println("");
            switch(numeroOperacao){
                case 0:
                    break;
                case 1:
                    System.out.println("O quanto de armadura o campeão tem?");
                    Double armadura = sc.nextDouble();
                    Double resultado = (armadura / (100 + armadura)) * 100;
                    String fraseResultado = String.format("Com %.0f de armadura você previne %.1f%% de dano", armadura, resultado);
                    System.out.println(fraseResultado);
                    break;
                case 2:
                    // Penetração
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while(numeroOperacao != 0);
    }
}
