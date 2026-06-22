/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Praticando;

/**
 *
 * @author Pietro
 */
public class Subtracao extends Operacoes {

    public Subtracao(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double calcular() {
        return n1-n2;
    }
    
}
