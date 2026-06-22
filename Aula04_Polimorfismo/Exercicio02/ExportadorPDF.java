/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio02;

/**
 *
 * @author Pietro
 */
public class ExportadorPDF extends Exportador {

    @Override
    public void exportar(String dados) {
        System.out.println("Exportando as informações "+dados+" para arquivo PDF.");
    }
    
}
