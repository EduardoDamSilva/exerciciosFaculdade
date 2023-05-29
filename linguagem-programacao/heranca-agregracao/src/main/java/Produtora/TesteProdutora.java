/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Produtora;

/**
 *
 * @author eduardo
 */
public class TesteProdutora {

    public static void main(String[] args) {
        Produtora sptech = new Produtora("SPTech", 5);
        Ator ator1 = new Ator("Eduardo", 150, 100.00);
        Ator ator2 = new Ator("Matheus", 200, 100.00);
        Protagonista ator3 = new Protagonista(100, 80.00, "Pedrao");
        
        System.out.println(ator1);
        System.out.println(ator2);
        System.out.println(ator3);
        
        sptech.contratar(ator1);
        sptech.contratar(ator2);
        sptech.contratar(ator3);

        sptech.existePorNome(
                "Eduardo");
        sptech.getAtores();
        sptech.getQuantidadeProtagonistas();
        sptech.getTotalSalarios();

        sptech.buscarAtorPorNome("Eduardo");
        System.out.println(sptech);
    }

}
