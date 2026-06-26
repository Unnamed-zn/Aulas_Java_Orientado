/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio03;

/**
 *
 * @author Pietro
 */
public class Veiculo {
    protected String placa;
    protected int anoFacricacao;

    public String getPlaca() {
        return placa;
    }

    public int getAnoFacricacao() {
        return anoFacricacao;
    }
    
    public double calcularTaxa() {
        return 10.00;
    }
    
}