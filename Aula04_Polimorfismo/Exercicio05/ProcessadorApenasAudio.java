/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio05;

/**
 *
 * @author Pietro
 */
public class ProcessadorApenasAudio extends ProcessadorVideo {

    @Override
    public void processar(String nomeArquivo) {
        System.out.println("Extraindo faixa de audio do video "+nomeArquivo+".");
    }
    
}
