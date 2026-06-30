/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05;

/**
 *
 * @author PIETROPEREIRALIMA
 */
public class Bruxo {
    private String nome;
    private Varinha varinha;

    public Bruxo(String nome, Varinha varinha) {
        this.nome = nome;
        this.varinha = varinha;
    }
    
    public void lancarFeitico(String feitico) {
        System.out.println(nome+" agitou sua varinha de "+varinha.getMadeira()+" e lançou o feitiço "+feitico+".");
    }
}