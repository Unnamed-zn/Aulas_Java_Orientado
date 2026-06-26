/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula05_Heranca.Exercicio03;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Veiculo veiculo;

        System.out.println("===== CADASTRO DE CARRO VIP =====");

        System.out.print("Digite a placa do veículo: ");
        String placa = scan.nextLine();

        System.out.print("Digite o ano de fabricação: ");
        int anoFabricacao = scan.nextInt();

        System.out.print("O motorista oferece água? (true/false): ");
        boolean ofereceAgua = scan.nextBoolean();

        veiculo = new CarroVip(placa, anoFabricacao, ofereceAgua);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Exibir dados do veículo");
            System.out.println("2 - Exibir benefícios do Carro VIP");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Placa: " + veiculo.getPlaca());
                    int ano = veiculo.getAnoFacricacao();
                    System.out.println("Ano de fabricação: " + ano);
                    ((CarroVip)veiculo).exibirBeneficios();
                    break;

                case 2:
                    System.out.println("Categoria: Carro VIP");
                    ((CarroVip)veiculo).exibirBeneficios();
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
