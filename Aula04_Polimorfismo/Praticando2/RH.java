/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Praticando2;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class RH {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolha;
        Funcionario f;
        
        System.out.println("========== CALCULADORA DE BÔNUS ==========");
        System.out.print("Qual nome do funcionário?\n -→ ");
        String nome = scan.nextLine();
        System.out.print("Qual salário base do funcionário?\n -→ ");
        double salario = scan.nextDouble();
        do {
            System.out.print("Qual cargo do funcionário?\n1. Suporte;\n2. Desenvolvedor;\n3. Gerente;\n0. Sair.\n-→ ");
            escolha = scan.nextInt();
            switch (escolha) {
                case 0:
                    return;
                case 1:
                    f = new Suporte(nome, salario);
                    System.out.println("O salário bônus deste funcionário ao atingir a meta proposta é de R$"+f.calcularBonus()+".");
                    return;
                case 2:
                    f = new Desenvolvedor(nome, salario);
                    System.out.println("O salário bônus deste funcionário ao atingir a meta proposta é de R$"+f.calcularBonus()+".");
                    return;
                case 3:
                    f = new Gerente(nome, salario);
                    System.out.println("O salário bônus deste funcionário ao atingir a meta proposta é de R$"+f.calcularBonus()+".");
                    return;
                default:
                    System.out.println("Escolha inválida, tente novamente.");
                    break;
            }
        } while (escolha!=0);
    }
}