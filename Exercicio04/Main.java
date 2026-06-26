/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula05_Heranca.Exercicio04;

import java.util.Scanner;

/**
 *
 * @author Pietro
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Notificacao n;
        System.out.println("======== PREPARANDO SMS ========");
        System.out.println("Digite o conteúdo da mensagem: ");
        String msg = scan.nextLine();
        System.out.println("Informe o destinatário: ");
        String dest = scan.nextLine();
        
        n = new NotificacaoSMS(msg, dest);
        ((NotificacaoSMS)n).enviar();
    }
}
