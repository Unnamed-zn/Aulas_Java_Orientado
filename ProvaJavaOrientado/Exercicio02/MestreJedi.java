/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio02;

/**
 *
 * @author PIETROPEREIRALIMA
 */
public class MestreJedi extends Jedi {
    private String corDoSabre;
    
    public MestreJedi(String nome, int nivelDaForca, String corDoSabre) {
        super(nome, nivelDaForca);
        this.corDoSabre = corDoSabre;
    }
    
    public void exibirMestre() {
        System.out.println("Nome do Mestre: "+nome);
        System.out.println("Nível da Força: "+nivelDaForca);
        System.out.println("Cor do Sabre: "+corDoSabre);
    }
}
