/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio04;

/**
 *
 * @author Pietro
 */
public class Notificacao {
    protected String mensagem;
    protected String destinatario;

    public String getMensagem() {
        return mensagem;
    }

    public String getDestinatario() {
        return destinatario;
    }
    
    public void enviar() {
        System.out.println("Enviando mensagem genérica...");
    }
}
