/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio04;

/**
 *
 * @author Pietro
 */
public class AutenticadorBiometria extends Autenticador {

    @Override
    public void validar(String credencial) {
        System.out.println("Escaneando a digital para validar a biometria da credencial "+credencial);
    }
    
}
