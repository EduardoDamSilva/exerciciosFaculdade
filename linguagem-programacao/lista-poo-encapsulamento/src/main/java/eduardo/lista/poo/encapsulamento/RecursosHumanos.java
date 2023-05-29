/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eduardo.lista.poo.encapsulamento;

/**
 *
 * @author eduardo
 */
public class RecursosHumanos {
    
    private Integer totalPromovidos;
    private Integer totalSalariosReajustados;
    
    public RecursosHumanos(){
        totalPromovidos = 0;
        totalSalariosReajustados = 0;
    }
    
    void reajustarSalario(Double valorReajuste, Colaborador colab){
        colab.setSalario(colab.getSalario() + valorReajuste);
        totalSalariosReajustados += 1;
    }
    
    void promoverColaborador(Colaborador colab, String cargo, Double salario){
        if (salario > colab.getSalario()){
            colab.setCargo(cargo);
            colab.setSalario(salario);
            totalPromovidos += 1;
        } else {
            System.out.println("Operação inválida");
        }        
    }

    public Integer getTotalPromovidos() {
        return totalPromovidos;
    }

    public void setTotalPromovidos(Integer totalPromovidos) {
        this.totalPromovidos = totalPromovidos;
    }

    public Integer getTotalSalariosReajustados() {
        return totalSalariosReajustados;
    }

    public void setTotalSalariosReajustados(Integer totalSalariosReajustados) {
        this.totalSalariosReajustados = totalSalariosReajustados;
    }

    @Override
    public String toString() {
        return "RecursosHumanos \n" 
                + "totalPromovidos: " + totalPromovidos + "\n" 
                + "totalSalariosReajustados: " + totalSalariosReajustados;
    }
    
    
    
    
    
    
}
