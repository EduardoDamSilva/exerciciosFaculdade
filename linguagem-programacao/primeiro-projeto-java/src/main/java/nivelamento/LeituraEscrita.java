package nivelamento;

import java.util.Scanner;

/**
 *
 * @author edubi
 */
public class LeituraEscrita {
    public static void main(String[] args) {
        // Para ler valores do teclado usamos a classe Scanner
        
        //sc não é uma simples variável e sim um OBJETO
        // Criar objeto = instânciar
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeDigitado = sc.nextLine();
        
        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = sc.nextInt();
        
        System.out.println("Digite sua altura: ");
        Double alturaDigitada = sc.nextDouble();
        
        System.out.println("Nome: " + nomeDigitado + "\nIdade: " + idadeDigitada + "\nAltura: " + alturaDigitada);
    }
}
