/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**
 *
 * @author PIETROPEREIRALIMA
 */
public class Main {
    public static void main(String[] args) {
        MonstrobolsoAgua mba = new MonstrobolsoAgua("Blaxtoiso");
        MonstrobolsoFogo mbf = new MonstrobolsoFogo("Charissandro");
        
        mba.atacar();
        mbf.atacar();
    }
}