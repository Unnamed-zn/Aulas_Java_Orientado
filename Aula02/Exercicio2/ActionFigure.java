package Aula02.Exercicio2;

public class ActionFigure {
    private String personagem;
    private double altura;
    private int condicaoPintura;
    
    public ActionFigure() {
        this.personagem = "Genérico";
        this.altura = 5.00;
        this.condicaoPintura = 100;
    }

    public ActionFigure(String personagem, double altura, int condicaoPintura) {
        this.personagem = personagem;
        this.altura = altura;
        this.condicaoPintura = condicaoPintura;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getCondicaoPintura() {
        return condicaoPintura;
    }

    public void setCondicaoPintura(int condicaoPintura) {
        if (condicaoPintura<0 || condicaoPintura>100) {
            System.out.println("A condição da pintura deve ser entre 0 e 100, condição definida para 100 para adequação.");
            this.condicaoPintura = 100;
        } else {
            this.condicaoPintura = condicaoPintura;
        }
    }
    
}