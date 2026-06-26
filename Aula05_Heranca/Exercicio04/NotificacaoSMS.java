/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio04;

/**
 *
 * @author Pietro
 */
public class NotificacaoSMS extends Notificacao {

    public NotificacaoSMS(String mensagem, String destinatario) {
        this.mensagem = mensagem;
        this.destinatario = destinatario;
    }
    
    @Override
    public void enviar() {
        if (mensagem.length()<=160) {
            System.out.println("Mensagem enviada, conteúdo:\n"+mensagem);
        } else {
            System.out.println("Falha ao enviar mensagem, tamanho além do alcance do SMS.");
        }
    }
    
}
