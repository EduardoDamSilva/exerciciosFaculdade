/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.segundo.projeto.nivelamento;

/**
 *
 * @author eduardo
 */
public class OperadorTernario {
    public static void main(String[] args) {
        
        Boolean bloqueado = true;
        
        String frase;
        if(bloqueado){
            frase = "Usuário bloqueado";
        } else {
            frase = "Usuário desbloqueado";
        }
        
        frase = bloqueado ? "Usuário bloqueado" : "Usuário desbloqueado";
        
        System.out.println(frase);
        
        // Cenário: se o funcionário ganha mais de 1000.00 o bonus é de 0.15,
        // se ganha menos de 1000.00 o bônus é de 0.10
        
        Double bonus;
        Double salario = 1078.50;
        
        bonus = salario > 1000.0 ? 0.15 : 0.10;
        
        System.out.println("Bônus: " + bonus);
        
    }
}
