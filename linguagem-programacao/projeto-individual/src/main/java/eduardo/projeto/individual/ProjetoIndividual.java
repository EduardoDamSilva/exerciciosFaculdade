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
                            + "2 - Descubra seu estilo de jogo\n" 
                            + "3 - Descubra a % dos jogares que estão abaixo de você\n" 
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
                    Integer numeroClasse;
                    do{System.out.println(
                            "Qual classe mais chama sua atenção:\n"
                                    + "1 - Tanque \n"
                                    + "2 - Mago \n"
                                    + "3 - Assasino \n"
                                    + "4 - Dano \n"
                                    + "5 - Suporte"
                    );
                    numeroClasse = sc.nextInt();
                    System.out.println("");
                    System.out.println("Sugestão de lanes para jogar");
                    switch(numeroClasse){
                        case 1:
                            System.out.println("Top lane e Jungle");
                        break;
                        case 2:
                            System.out.println("Mid lane, Jungle e Suporte");
                        case 3:
                            System.out.println("Mid lane e Jungle");
                        case 4: 
                            System.out.println("Adc(Bot lane)");
                        case 5:
                            System.out.println("Jungle e Suporte(Bot lane)");
                        default:
                            System.out.println("Insira um número válido");
                    }} while(numeroClasse < 1 || numeroClasse > 5);
                    break;
                case 3:
                    Integer numeroElo;
                    do{System.out.println(
                            "Digite o número que represente o seu elo:\n"
                                    + "1 - Desafiante"
                                    + "2 - Grão-Mestre"
                                    + "3 - Mestre"
                                    + "4 - Diamante"
                                    + "5 - Platina"
                                    + "6 - Ouro"
                                    + "7 - Prata"
                                    + "8 - Bronze"
                                    + "9 - Ferro"
                    );
                    numeroElo = sc.nextInt();
                    System.out.println("");
                    switch(numeroElo){
                        case 1:
                            System.out.println("Você chegou ao topo Parabéns! você está acima dos 99,98% dos jogares");
                            break;
                        case 2:
                            System.out.println("Você estando Grão-Mestre está acima dos 99,95% dos jogares");
                            break;
                        case 3:
                            System.out.println("Você estando Mestre está acima 99.7% dos jogares");
                            break;
                        case 4:
                            System.out.println("Você estando no Diamante está acima dos 98% dos jogares");
                            break;
                        case 5:
                            System.out.println("Você estando no Platina está acima dos 88% dos jogares");
                            break;
                        case 6:
                            System.out.println("Você estando no Ouro está acima dos 65% dos jogares");
                            break;
                        case 7:
                            System.out.println("Você estando no Prata está acima dos 31%");
                            break;
                        case 8:
                            System.out.println("Você estando no Bronze está acima dos 5% dos jogaredes");
                            break;
                        case 9:
                            System.out.println("Você estando no Ferro não está acima de ninguém :')");
                            break;
                    }
                    }while(numeroElo < 1 || numeroElo > 9);
                    break;
                //case 4:
                   // break;
                //case 5:
                   // break;
            }
        }while(numeroOperacao != 0);
    }
}
