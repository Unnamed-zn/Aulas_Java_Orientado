/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio02;

/**
 *
 * @author Pietro
 */
public class Desenvolvedor extends Funcionario {
    private double bonusPorProjeto;
    
    public Desenvolvedor(String nome, double salarioBase, double bonusPorProjeto) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.bonusPorProjeto = bonusPorProjeto;
    }
    
    @Override
    public double calcularSalario() {
        return (salarioBase+(bonusPorProjeto));
    }
    
    public double getBonusPorProjeto() {
        return bonusPorProjeto;
    }
}
