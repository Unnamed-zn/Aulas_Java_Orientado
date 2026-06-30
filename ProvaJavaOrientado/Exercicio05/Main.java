/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio05;

/**
 *
 * @author PIETROPEREIRALIMA
 */
public class Main {
    public static void main(String[] args) {
        Varinha v = new Varinha("cedro", "pelo de unicórnio");
        Bruxo b = new Bruxo("Rogério", v);
        
        b.lancarFeitico("expelliarmus");
    }
}