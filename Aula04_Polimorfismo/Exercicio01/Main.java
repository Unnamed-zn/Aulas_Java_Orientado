/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio01;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        RegistradorLog log;
        String acao;
        
        do {
            System.out.println("\n=== Selecione o tipo de gravação ===");
            System.out.println("1 - Gravação na Nuvem");
            System.out.println("2 - Gravação em Arquivo");
            System.out.println("3 - Gravação em Banco de Dados");
            System.out.print("Digite sua opção: ");

            opcao = scan.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao < 1 || opcao > 3);

        switch (opcao) {
            case 1:
                log = new LogNaNuvem();
                System.out.print("Qual ação deseja gravar? ");
                scan.nextLine();
                acao = scan.nextLine();
                log.gravar(acao);
                break;
            case 2:
                log = new LogEmArquivo();
                System.out.print("Qual ação deseja gravar? ");
                scan.nextLine();
                acao = scan.nextLine();
                log.gravar(acao);
                break;
            case 3:
                log = new LogBancoDeDados();
                System.out.print("Qual ação deseja gravar? ");
                scan.nextLine();
                acao = scan.nextLine();
                log.gravar(acao);
                break;
        }
    }
}
