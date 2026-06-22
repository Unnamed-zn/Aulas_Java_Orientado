/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Praticando;

/**
 *
 * @author Pietro
 */
public class Divisao extends Operacoes {

    public Divisao(double n1, double n2) {
        super(n1, n2);
    }

    @Override
    public double calcular() {
        if (n2==0 && n1!=0) {
            System.out.println("Impossível dividir qualquer valor diferente de 0 por 0, portanto, retornamos 0.");
            return 0;
        }
        
        if (n1==0 && n2==0) {
            System.out.println("A divisão de 0 por 0 é indefinida, pois qualquer resultado seria possível, portanto, retornamos 1.");
            return 1;
        }
        
        return n1/n2;
    }
    
}
