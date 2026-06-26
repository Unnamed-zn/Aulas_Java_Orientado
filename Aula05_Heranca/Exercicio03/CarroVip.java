/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio03;

/**
 *
 * @author Pietro
 */
public class CarroVip extends Veiculo {
    private boolean ofereceAgua;
    
    public CarroVip(String placa, int anoFacricacao, boolean ofereceAgua) {
        this.placa = placa;
        this.anoFacricacao = anoFacricacao;
        this.ofereceAgua = ofereceAgua;
    }
    
    @Override
    public double calcularTaxa() {
        return 25.00;
    }
    
    public void exibirBeneficios() {
        System.out.println("Oferece água: "+(ofereceAgua? "sim" : "não"));
    }
}
