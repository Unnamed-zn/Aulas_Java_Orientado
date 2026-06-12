package Aula02.Exercicio5;

public class Main {
    public static void main(String[] args) {
        MillenniumFalconLego MFL = new MillenniumFalconLego();
        
        System.out.println(MFL.toString());
        
        MFL.setPecasMontadas(190);
        
        MFL.exibirProgresso();
    }
}
