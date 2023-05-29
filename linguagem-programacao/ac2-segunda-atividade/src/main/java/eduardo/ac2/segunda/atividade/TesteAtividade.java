/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.ac2.segunda.atividade;

/**
 *
 * @author eduardo
 */
public class TesteAtividade {
    public static void main(String[] args) {
        
        Atividade atv1 = new Atividade("Open Lab", "Eduardo", 1);
        Atividade atv2 = new Atividade("Tela Swing Java", "Eduardo", 7);
        Atividade atv3 = new Atividade("Slide sobre a Metodologia", "Eduardo", 7);
        
        atv1.terminarAtividade(1);
        atv2.terminarAtividade(9);
        atv3.terminarAtividade(3);
        
        atv1.exibirRelatorio();
        atv2.exibirRelatorio();
        atv3.exibirRelatorio();
        
        System.out.println("---------------------------");
        System.out.println(atv1);
        System.out.println(atv2);
        System.out.println(atv3);
    }
}
