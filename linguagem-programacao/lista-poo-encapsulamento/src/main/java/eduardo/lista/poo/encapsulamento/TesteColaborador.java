/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.poo.encapsulamento;

/**
 *
 * @author eduardo
 */
public class TesteColaborador {
    public static void main(String[] args) {
        
        Colaborador colab01 = new Colaborador("Eduardo", "Estagiário", 3000.00);
        Colaborador colab02 = new Colaborador("Matheus", "Estagiário", 2500.00);
        RecursosHumanos rh = new RecursosHumanos();
        
        System.out.println("Colaborador 01:");
        System.out.println(colab01.getNome());
        System.out.println(colab01.getCargo());
        System.out.println(colab01.getSalario());
        
        System.out.println("Colaborador 02:");
        System.out.println(colab02.getNome());
        System.out.println(colab02.getCargo());
        System.out.println(colab02.getSalario());
        System.out.println("----------------------------------------");
        
        rh.promoverColaborador(colab01, "Analista Junior", 4000.00);
        rh.promoverColaborador(colab02, "Analista Junior", 2400.00);
        
        rh.reajustarSalario(3000.00, colab02);
        
        System.out.println("Colaborador 01:");
        System.out.println(colab01.getNome());
        System.out.println(colab01.getCargo());
        System.out.println(colab01.getSalario());
        
        System.out.println("Colaborador 02:");
        System.out.println(colab02.getNome());
        System.out.println(colab02.getCargo());
        System.out.println(colab02.getSalario());
        
        System.out.println("Total promovidos: " + rh.getTotalPromovidos());
        System.out.println("Total salários reajustados: " + rh.getTotalSalariosReajustados());
        
    }
}
