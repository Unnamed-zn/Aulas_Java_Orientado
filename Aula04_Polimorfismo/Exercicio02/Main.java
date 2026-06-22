/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio02;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao;
        Exportador exp;
        String acao;
        
        do {
            System.out.println("\n=== Selecione o tipo de exportação ===");
            System.out.println("1 - Arquivo PDF");
            System.out.println("2 - Arquivo CSV");
            System.out.println("3 - Arquivo JSON");
            System.out.print("Digite sua opção: ");

            opcao = scan.nextInt();

            if (opcao < 1 || opcao > 3) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao < 1 || opcao > 3);

        switch (opcao) {
            case 1:
                exp = new ExportadorPDF();
                System.out.print("Quais informações deseja exportar? ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.exportar(acao);
                break;
            case 2:
                exp = new ExportadorCSV();
                System.out.print("Quais informações deseja exportar? ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.exportar(acao);
                break;
            case 3:
                exp = new ExportadorJSON();
                System.out.print("Quais informações deseja exportar? ");
                scan.nextLine();
                acao = scan.nextLine();
                exp.exportar(acao);
                break;
        }
    }
}
