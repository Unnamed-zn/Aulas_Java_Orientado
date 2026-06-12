package Aula02.Exercicio1;

public class SabreDeLuzBrinquedo {
    private String cor;
    private boolean emiteSom, ligado;
    
    public SabreDeLuzBrinquedo(String cor, boolean emiteSom, boolean ligado) {
        this.cor = cor;
        this.emiteSom = emiteSom;
        this.ligado = ligado;
    }
    
    public SabreDeLuzBrinquedo() {
        this.cor = "azul";
        this.emiteSom = false;
        this.ligado = false;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEmiteSom() {
        return emiteSom;
    }

    public void setEmiteSom(boolean emiteSom) {
        this.emiteSom = emiteSom;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    public void ligar() {
        if (ligado) {
            System.out.println("O sabre já está ligado.");
        } else if (emiteSom) {
            System.out.println("ZUOOOOON! Seu sabre fez som de batalha e agora está ligado.");
            this.ligado = true;
        } else {
            System.out.println("Seu sabre ligou em um silêncio absoluto.");
            this.ligado = true;
        }
    }
    
    public void desligar() {
        if (!ligado) {
            System.out.println("Seu sabre não está ligado para ser desligado.");
        } else {
            System.out.println("Seu sabre desligou.");
            this.ligado = false;
        }
    }
}
