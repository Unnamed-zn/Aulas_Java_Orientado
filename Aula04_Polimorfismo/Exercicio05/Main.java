/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio05;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        ProcessadorVideo exp;
        String acao;
        
        do {
            System.out.println("\n=== Selecione o tipo de processamento para o vídeo ===");
            System.out.println("1 - Processar para mobile");
            System.out.println("2 - Processar para alta definição");
            System.out.println("3 - Processar apenas audio");
            System.out.print("Digite sua opção: ");

            opcao = scan.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao < 1 || opcao > 3);

        switch (opcao) {
            case 1:
                exp = new ProcessadorMobile();
                System.out.print("Digite o nome do vídeo a ser processado: ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.processar(acao);
                break;
            case 2:
                exp = new ProcessadorAltaDefinicao();
                System.out.print("Digite o nome do vídeo a ser processado: ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.processar(acao);
                break;
            case 3:
                exp = new ProcessadorApenasAudio();
                System.out.print("Digite o nome do vídeo a ser processado: ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.processar(acao);
                break;
        }
    }
}
