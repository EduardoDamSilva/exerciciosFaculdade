package eduardo.heranca.agregracao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eduardo
 */
public class TesteConsultoria {
    public static void main(String[] args) {
        Consultoria sptech = new Consultoria("SPTech", 5);
        Desenvolvedor dev1 = new Desenvolvedor("Eduardo", 150, 100.00);
        Desenvolvedor dev2 = new Desenvolvedor("Matheus", 200, 100.00);
        Desenvolvedor dev3 = new Desenvolvedor("Pedrao", 100, 80.00);
        
        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);
        
        sptech.contratar(dev1);
        sptech.contratar(dev2);
        sptech.contratar(dev3);
        
        sptech.existePorNome("Eduardo");
        sptech.getDesenvolvedores();
        sptech.getQuantidadeDesenvolvedorMobile();
        sptech.getTotalSalarios();
        sptech.buscarDesenvolvedorPorNome("Eduardo");
        System.out.println(sptech);
    }
}
