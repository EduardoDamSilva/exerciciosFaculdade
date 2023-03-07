/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.atividade02.ac1;

/**
 *
 * @author Usuário
 */
public class ValidacaoNumerica {
    void verificarPrimo(Integer num){
        Integer numDivisivel = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                numDivisivel++;
            }
        }
        
        if(numDivisivel == 2){
            System.out.println("O numero é primo");
        } else {
            System.out.println("O numero não é primo");
        }
    }
}
