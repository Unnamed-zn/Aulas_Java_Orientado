/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula02.Exercicio3;

/**
 *
 * @author Pietro
 */
public class ReplicaAnelUnico {
    private String material;
    private int tamanhoAro;
    private boolean inscricaoVisivel;
    
    public ReplicaAnelUnico() {
        this.material = "ouro";
        this.tamanhoAro = 2;
        this.inscricaoVisivel = false;
    }
    
    public ReplicaAnelUnico(String material, int tamanhoAro) {
        this.material = material;
        this.tamanhoAro = tamanhoAro;
        this.inscricaoVisivel = false;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getTamanhoAro() {
        return tamanhoAro;
    }

    public void setTamanhoAro(int tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }

    public boolean isInscricaoVisivel() {
        return inscricaoVisivel;
    }
    
    public void jogarNoFogo() {
        this.inscricaoVisivel = true;
        System.out.println("Você jogou o anel no fogo e a sua inscrição foi revelada.");
    }
    
}
