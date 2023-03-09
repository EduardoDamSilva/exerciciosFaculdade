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
public class TesteProjetoIndividual {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ProjetoIndividual proj = new ProjetoIndividual();
        
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
                    proj.calcularArmadura(armadura);
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
                    proj.descobrirEstiloJogo(numeroClasse);
                    } while(numeroClasse < 1 || numeroClasse > 5);
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
                    proj.descubraPorcentagemDoElo(numeroElo);
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
                        pontuacao = proj.verificarResposta1(numeroAlternativa);
                    }while(numeroAlternativa < 1 || numeroAlternativa > 4);
                    
                    do{
                        System.out.println("A escalada é longa, mas a vista vale a pena!\n"
                            + "1 - Taric\n"
                            + "2 - Braum\n"
                            + "3 - Jhin\n"
                            + "4 - Ornn");
                        numeroAlternativa = sc.nextInt(); 
                        pontuacao += proj.verificarResposta2(numeroAlternativa);
                    } while(numeroAlternativa < 1 || numeroAlternativa > 4);
                    
                    do{
                        System.out.println("A verdadeira sabedoria é reconhecer o valor da própria ignorância\n"
                            + "1 - Thresh\n"
                            + "2 - Renekton\n"
                            + "3 - Aphelions\n"
                            + "4 - Lee sin");
                        numeroAlternativa = sc.nextInt();
                        pontuacao += proj.verificarResposta3(numeroAlternativa);
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
