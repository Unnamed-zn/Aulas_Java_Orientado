/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio01;

/**
 *
 * @author PIETROPEREIRALIMA
 */
public class PersonagemRPG {
    private String nome;
    private int pontosDeVida;

    public PersonagemRPG(String nome, int pontosDeVida) {
        this.nome = nome;
        this.pontosDeVida = pontosDeVida;
    }

    public String getNome() {
        return nome;
    }

    public int getPontosDeVida() {
        return pontosDeVida;
    }
    
    public void receberDano(int dano) {
        pontosDeVida=Math.max((pontosDeVida-dano), 0);
        if (pontosDeVida==0) {
            System.out.println("O personagem "+nome+" foi derrotado!");
        }
    }
}
