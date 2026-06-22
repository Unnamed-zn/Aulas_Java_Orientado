/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio05;

/**
 *
 * @author Pietro
 */
public class ProcessadorAltaDefinicao extends ProcessadorVideo {

    @Override
    public void processar(String nomeArquivo) {
        System.out.println("Tratando qualidade do vídeo "+nomeArquivo+" para polir a resolução.");
    }
    
}
