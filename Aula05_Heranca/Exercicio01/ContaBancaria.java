/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio01;

/**
 *
 * @author Pietro
 */
public abstract class ContaBancaria {
    protected String numeroConta;
    protected double saldo;

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar (double deposito) {
        saldo+=deposito;
    }
    
    public void sacar (double saque) {
        if (saque>saldo) {
            System.out.println("Saldo insuficiente para saque, operação encerrada por imprevisto.");
        } else {
            saldo-=saque;
            System.out.println("Operação realizada com sucesso, saldo atual: R$"+saldo);
        }
    }
}
