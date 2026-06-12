package Aula02.Exercicio4;

public class Main {
    public static void main(String[] args) {
        CartaPokemon CP1 = new CartaPokemon();
        CartaPokemon CP2 = new CartaPokemon("Charizard", "Fogo/Voador", 160);
        
        System.out.println(CP1.toString());
        System.out.println(CP2.toString());
    }
}
