/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio01;

/**
 *
 * @author Pietro
 */
public class LogBancoDeDados extends RegistradorLog {

    @Override
    public void gravar(String acao) {
        System.out.println("Processando Gravação em Banco de Dados.");
        System.out.println("Ação a ser Gravada: "+acao);
    }
    
}
