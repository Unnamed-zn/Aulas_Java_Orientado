/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio02;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcionario funcionario;

        System.out.println("===== CADASTRO DE FUNCIONÁRIO =====");

        System.out.print("Digite o nome do desenvolvedor: ");
        String nome = scan.nextLine();

        System.out.print("Digite o salário base: R$");
        double salarioBase = scan.nextDouble();

        System.out.print("Digite o bônus recebido por projetos: R$");
        double bonusProjetos = scan.nextDouble();

        funcionario = new Desenvolvedor(nome, salarioBase, bonusProjetos);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Exibir dados do funcionário");
            System.out.println("2 - Calcular salário final");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Nome: " + funcionario.getNome());
                    System.out.printf("Salário Base: R$%.2f%n", funcionario.getSalarioBase());
                    System.out.printf("Bônus de projetos: R$%.2f%n", ((Desenvolvedor)funcionario).getBonusPorProjeto());
                    break;

                case 2:
                    System.out.printf("Salário Final: R$ %.2f%n", funcionario.calcularSalario());
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }
}
