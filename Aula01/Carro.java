package Aula01;

public class Carro {
    String nome;
    String modelo;
    int ano;
    boolean ligado;
    
    void ligar() {
        ligado = true;
        System.out.println("VRUM VRUM!");
    }
    
    void desligar() {
        ligado = false;
        System.out.println("Carro desligado.");
    }
}
