/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Praticando;

/**
 *
 * @author Pietro
 */
public abstract class Operacoes {
    protected double n1, n2;

    public Operacoes(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public abstract double calcular ();
    
}
