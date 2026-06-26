/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula05_Heranca.Exercicio01;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContaBancaria cb;
        
        System.out.println("===== MENU DE ATENDIMENTO DO BANCO TIKOMI =====");
        System.out.println("Vamos começar a criar sua conta corrente;");
        System.out.print("Digite o número da sua conta: ");
        String numeroConta = scan.nextLine();
        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scan.nextDouble();
        System.out.print("Digite o limite de seu cheque especial: ");
        double limiteCheque = scan.nextDouble();
        
        cb = new ContaCorrente(numeroConta, saldo, limiteCheque);
        int opcao;
        do {
            System.out.println("===== MENU BANCÁRIO =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor para depósito: R$");
                    double deposito = scan.nextDouble();
                    cb.depositar(deposito);
                    break;

                case 2:
                    System.out.print("Valor para saque: R$ ");
                    double saque = scan.nextDouble();
                    cb.sacar(saque);
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", cb.getSaldo());
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
