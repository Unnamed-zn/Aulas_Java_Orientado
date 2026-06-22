/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio03;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        TratamentoChamado exp;
        String acao;
        
        do {
            System.out.println("\n=== Selecione o suporte para encaminhar ===");
            System.out.println("1 - Suporte em hardware");
            System.out.println("2 - Suporte em rede");
            System.out.println("3 - Suporte em software");
            System.out.print("Digite sua opção: ");

            opcao = scan.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao < 1 || opcao > 3);

        switch (opcao) {
            case 1:
                exp = new SuporteHardware();
                System.out.print("Qual reclamação deseja encaminhar? ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.encaminhar(acao);
                break;
            case 2:
                exp = new SuporteRede();
                System.out.print("Qual reclamação deseja encaminhar? ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.encaminhar(acao);
                break;
            case 3:
                exp = new SuporteSoftware();
                System.out.print("Qual reclamação deseja encaminhar? ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.encaminhar(acao);
                break;
        }
    }
}
