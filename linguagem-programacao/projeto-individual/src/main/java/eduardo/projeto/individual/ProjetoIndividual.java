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
                            + "4 - Quem disse isso? (Jogo)\n"
                            + "0 - Sair"
                            
            );
            numeroOperacao = sc.nextInt();
            System.out.println("");
            switch(numeroOperacao){
                case 0:
                    System.out.println("Boa gameplay, até!");
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
                            break;
                        case 3:
                            System.out.println("Mid lane e Jungle");
                            break;
                        case 4: 
                            System.out.println("Adc(Bot lane)");
                            break;
                        case 5:
                            System.out.println("Jungle e Suporte(Bot lane)");
                            break;
                        default:
                            System.out.println("Insira um número válido");
                    }} while(numeroClasse < 1 || numeroClasse > 5);
                    break;
                case 3:
                    Integer numeroElo;
                    do{System.out.println(
                            "Digite o número que represente o seu elo:\n"
                                    + "1 - Desafiante\n"
                                    + "2 - Grão-Mestre\n"
                                    + "3 - Mestre\n"
                                    + "4 - Diamante\n"
                                    + "5 - Platina\n"
                                    + "6 - Ouro\n"
                                    + "7 - Prata\n"
                                    + "8 - Bronze\n"
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
                        default:
                            System.out.println("Digite um número válido.");
                    }
                    }while(numeroElo < 1 || numeroElo > 9);
                    break;
                case 4:
                    Integer jogarNovamenteNumero;
                    do{
                    Integer pontuacao = 0;
                    Integer numeroAlternativa;
                    do{
                        System.out.println("Nunca torne-se um monstro para derrotar outro.\n"
                            + "1 - Kayle\n"
                            + "2 - Morgana\n"
                            + "3 - Karma\n"
                            + "4 - Master Yi");
                        numeroAlternativa = sc.nextInt();
                        switch(numeroAlternativa){
                            case 1:
                                System.out.println("Resposta Errada!");
                                break;
                            case 2:
                                System.out.println("Resposta Errada!");
                                break;
                            case 3:
                                System.out.println("Reposta Correta! + 50 pontos");
                                pontuacao += 50;
                                break;
                            case 4:
                                System.out.println("Resposta Errada!");
                                break;
                            default:
                                System.out.println("Digite um número válido.");
                        }
                        
                            
                    }while(numeroAlternativa < 1 || numeroAlternativa > 4);
                    
                    do{
                        System.out.println("A escalada é longa, mas a vista vale a pena!\n"
                            + "1 - Taric\n"
                            + "2 - Braum\n"
                            + "3 - Jhin\n"
                            + "4 - Ornn");
                        numeroAlternativa = sc.nextInt();
                        switch(numeroAlternativa){
                            case 1:
                                System.out.println("Reposta Correta! + 50 pontos");
                                pontuacao += 50;
                                break;
                            case 2:
                                System.out.println("Resposta Errada!");
                                break;
                            case 3:
                                System.out.println("Resposta Errada!");
                                break;
                            case 4:
                                System.out.println("Resposta Errada!");
                                break;
                            default:
                                System.out.println("Digite um número válido.");
                        }
                    } while(numeroAlternativa < 1 || numeroAlternativa > 4);
                    
                    do{
                        System.out.println("A verdadeira sabedoria é reconhecer o valor da própria ignorância\n"
                            + "1 - Thresh\n"
                            + "2 - Renekton\n"
                            + "3 - Aphelions\n"
                            + "4 - Lee sin");
                        numeroAlternativa = sc.nextInt();
                        switch(numeroAlternativa){
                            case 1:
                                System.out.println("Resposta Errada!");
                                break;
                            case 2:
                                System.out.println("Resposta Errada!");
                                break;
                            case 3:
                                System.out.println("Resposta Errada!");
                                break;
                            case 4:
                                System.out.println("Reposta Correta! + 50 pontos");
                                pontuacao += 50;
                                break;
                            default:
                                System.out.println("Digite um número válido.");
                        }
                    } while(numeroAlternativa < 1 || numeroAlternativa > 4);
                    System.out.println("Pontuação total: " + pontuacao);
                    System.out.println("Deseja jogar novamente? \n"
                            + "1 - Sim\n"
                            + "2 - Não");
                    jogarNovamenteNumero = sc.nextInt();
                    }while(jogarNovamenteNumero == 1);
            }
        }while(numeroOperacao != 0);
    }
}
