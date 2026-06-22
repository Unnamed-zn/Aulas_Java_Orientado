/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula04_Polimorfismo.Exercicio03;

/**
 *
 * @author Pietro
 */
public class SuporteRede extends TratamentoChamado {

    @Override
    public void encaminhar(String descricao) {
        System.out.println("Enviando analista de rede para avaliar o problema: "+descricao);
    }
    
}
