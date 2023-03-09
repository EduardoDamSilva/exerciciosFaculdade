/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.projeto.individual;

/**
 *
 * @author eduardo
 */

public class ProjetoIndividual {
    void calcularArmadura(Double armadura){
        Double resultado = (armadura / (100 + armadura)) * 100;
        String fraseResultado = String.format("Com %.0f de armadura você previne %.1f%% de dano", armadura, resultado);
        System.out.println(fraseResultado);
    }
    
    void descobrirEstiloJogo(Integer numeroClasse){
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
            }
    }
    
    void descubraPorcentagemDoElo(Integer numeroElo){
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
    }
    
    Integer verificarResposta1(Integer numeroAlternativa){
        switch(numeroAlternativa){
            case 1:
                System.out.println("Resposta Errada!");
                return 0;
            case 2:
                System.out.println("Resposta Errada!");
                return 0;
            case 3:
                System.out.println("Reposta Correta! + 50 pontos");
                return 50;
            case 4:
                System.out.println("Resposta Errada!");
                return 0;
            default:
                System.out.println("Digite um número válido.");
                return 0;
        }
    
    }
    
    Integer verificarResposta2(Integer numeroAlternativa){
        switch(numeroAlternativa){
            case 1:
                System.out.println("Reposta Correta! + 50 pontos");
                return 50;
            case 2:
                System.out.println("Resposta Errada!");
                return 0;
            case 3:
                System.out.println("Resposta Errada!");
                return 0;
            case 4:
                System.out.println("Resposta Errada!");
                return 0;
            default:
                System.out.println("Digite um número válido.");
                return 0;
        }
    }
    
    Integer verificarResposta3(Integer numeroAlternativa){
    switch(numeroAlternativa){
        case 1:
            System.out.println("Resposta Errada!");
            return 0;
        case 2:
            System.out.println("Resposta Errada!");
            return 0;
        case 3:
            System.out.println("Resposta Errada!");
            return 0;
        case 4:
            System.out.println("Reposta Correta! + 50 pontos");
            return 50;
        default:
            System.out.println("Digite um número válido.");
            return 0;
    }
    }
}
