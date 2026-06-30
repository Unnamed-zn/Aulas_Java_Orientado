/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio03;

/**
 *
 * @author PIETROPEREIRALIMA
 */
public class MonstrobolsoAgua extends Monstrobolso {

    public MonstrobolsoAgua(String nome) {
        super(nome);
    }

    @Override
    void atacar() {
        System.out.println("O seu Monstrobolso "+nome+" acabou de usar jato de água!");
    }
    
}
