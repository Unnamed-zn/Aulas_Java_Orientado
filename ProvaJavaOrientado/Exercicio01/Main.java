package Exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        PersonagemRPG p;
        
        System.out.println("Vamos criar seu personagem!");
        System.out.print("Qual nome do seu personagem?\n→ ");
        String nome = scan.nextLine();
        int vida;
        String vidaSt;
        do {
            System.out.print("Quantos pontos de vida ele tem?\n→ ");
            vidaSt = scan.nextLine();
            try {
                vida = Integer.parseInt(vidaSt);
                if (vida<=0) System.out.println("Pontuação inválida, digite um valor inteiro maior que 0");
            } catch (NumberFormatException e) {
                vida = 0;
                System.out.println("Pontuação inválida, digite um valor inteiro maior que 0.");
            }
        } while(vida<=0);
        p = new PersonagemRPG(nome, vida);
        int dano;
        do {
            System.out.print("Simulação de combate! Você recebeu um ataque, digite quanto dano recebeu.\n→ ");
            dano = scanInt.nextInt();
            p.receberDano(dano);
            System.out.println("Sua vida atual é de "+p.getPontosDeVida());
        } while (p.getPontosDeVida()>0);
    }
}
