package Aula02.Exercicio3;

public class Main {
    public static void main(String[] args) {
        ReplicaAnelUnico RAU = new ReplicaAnelUnico("Prata", 3);
        
        RAU.jogarNoFogo();
        
        System.out.println(RAU.getMaterial());
        System.out.println(RAU.getTamanhoAro());
        System.out.println(RAU.isInscricaoVisivel());
    }
}
