package Aula02.Exercicio1;

public class Main {
    public static void main(String[] args) {
        SabreDeLuzBrinquedo meuSabre = new SabreDeLuzBrinquedo();
        
        meuSabre.setEmiteSom(true);
        
        meuSabre.ligar();
        
        meuSabre.ligar();
        
        meuSabre.desligar();
        
        meuSabre.desligar();
        
        meuSabre.setEmiteSom(false);
        
        meuSabre.ligar();
    }
}
