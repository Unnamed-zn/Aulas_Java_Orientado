/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**
 *
 * @author PIETROPEREIRALIMA
 */
public abstract class Monstrobolso {
    protected String nome;

    public Monstrobolso(String nome) {
        this.nome = nome;
    }
    
    abstract void atacar();
}