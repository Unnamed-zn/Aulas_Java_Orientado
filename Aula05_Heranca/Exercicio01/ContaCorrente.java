/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula05_Heranca.Exercicio01;

/**
 *
 * @author Pietro
 */
public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(String numeroConta, double saldo, double limiteChequeEspecial) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.limiteChequeEspecial = limiteChequeEspecial;
    }
    
    @Override
    public void sacar(double saque) {
        if (saque>(saldo+limiteChequeEspecial)) {
            System.out.println("Saldo insuficiente para saque, operação encerrada por imprevisto.");
        } else {
            saldo-=saque;
            System.out.println("Operação realizada com sucesso, saldo atual: R$"+saldo);
        }
    }
}
