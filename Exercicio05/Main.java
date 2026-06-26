/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula05_Heranca.Exercicio05;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Assinatura assinatura;

        System.out.println("===== CADASTRO DO POBREFLIX =====");

        System.out.print("Digite seu e-mail: ");
        String email = scan.nextLine();
        String plano;
        boolean valido;
        do {
            System.out.print("Escolha o plano (Padrão/Premium): ");
            plano = scan.nextLine().toLowerCase();
            valido = plano.equals("padrão") || plano.equals("padrao") || plano.equals("premium");
            if (!valido) System.out.println("Opção inválida, tente novamente.");
        } while(!valido);
        
        if (plano.equals("padrao")) plano = "padrão";
        
        if (plano.equalsIgnoreCase("Premium")) {

            System.out.print("Deseja qualidade 4K? (true/false): ");
            boolean qualidade4k = scan.nextBoolean();
            double mensalidade = (qualidade4k? 45.00 : 35.00);
            
            assinatura = new PlanoPremium(email, mensalidade, qualidade4k);

        } else {

            assinatura = new Assinatura(email, 20.00);

        }

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Ver informações do perfil");
            System.out.println("2 - Ver benefícios");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("E-mail: " + assinatura.getEmail());
                    System.out.println("Plano: " + assinatura.getPlano());
                    System.out.printf("Mensalidade: R$ %.2f%n", assinatura.getMensalidade());
                    break;

                case 2:

                    if (assinatura instanceof PlanoPremium) {

                        ((PlanoPremium)assinatura).exibirBeneficios();

                    } else {

                        assinatura.exibirBeneficios();
                        
                    }

                    break;

                case 0:
                    System.out.println("Obrigado por usar o Pobreflix!");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

    }
    
}
