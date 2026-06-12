package Aula02.Exercicio2;

public class Main {
    public static void main(String[] args) {
        ActionFigure AF = new ActionFigure();
        
        AF.setPersonagem("Gocu");
        AF.setAltura(3.7);
        AF.setCondicaoPintura(101);
        
        System.out.println(AF.getPersonagem());
        System.out.println(AF.getAltura());
        System.out.println(AF.getCondicaoPintura());
    }
}
