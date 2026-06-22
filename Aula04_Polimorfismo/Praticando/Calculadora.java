/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Praticando;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Operacoes op = null;
        
        System.out.println("Digite o primeiro valor.");
        double n1 = scan.nextDouble();
        
        System.out.println("Digite o segundo valor");
        double n2 = scan.nextDouble();
        
        int escolha;
        do {
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1 - Adição;");
            System.out.println("2 - Subtração;");
            System.out.println("3 - Multiplicação;");
            System.out.println("4 - Divisão;");
            escolha = scan.nextInt();
        
            switch (escolha) {
                case 0:
                    return;
                case 1:
                    op = new Adicao(n1, n2);
                    System.out.println("O resultado é "+op.calcular());
                    return;
                case 2:
                    op = new Subtracao(n1, n2);
                    System.out.println("O resultado é "+op.calcular());
                    return;
                case 3:
                    op = new Multiplicacao(n1, n2);
                    System.out.println("O resultado é "+op.calcular());
                    return;
                case 4: 
                    op = new Divisao(n1, n2);
                    System.out.println("O resultado é "+op.calcular());
                    return;
                default:
                    System.out.println("opção inválida, tente novamente.");
                    break;
            }
        } while (escolha!=0);
    }
}
