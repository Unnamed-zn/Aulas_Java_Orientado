/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author PIETROPEREIRALIMA
 */
public abstract class Jedi {
    protected String nome;
    protected int nivelDaForca;

    public Jedi(String nome, int nivelDaForca) {
        this.nome = nome;
        this.nivelDaForca = nivelDaForca;
    }
    
    public void usarForca() {
        System.out.println(nome+" está se concentrando na Força...");
    }
}