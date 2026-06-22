/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio04;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        Autenticador exp;
        String acao;
        
        do {
            System.out.println("\n=== Digite a forma para a autenticação ===");
            System.out.println("1 - Biometria");
            System.out.println("2 - Senha");
            System.out.println("3 - Token");
            System.out.print("Digite sua opção: ");

            opcao = scan.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao < 1 || opcao > 3);

        switch (opcao) {
            case 1:
                exp = new AutenticadorBiometria();
                System.out.print("Digite a credencial a ser autenticada: ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.validar(acao);
                break;
            case 2:
                exp = new AutenticadorSenha();
                System.out.print("Digite a credencial a ser autenticada: ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.validar(acao);
                break;
            case 3:
                exp = new AutenticadorToken();
                System.out.print("Digite a credencial a ser autenticada: ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.validar(acao);
                break;
        }
    }    
}
