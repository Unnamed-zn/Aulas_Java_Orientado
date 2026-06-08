package Aula01;

public class ContaBancaria {
    int numeroConta;
    double saldo;
    String titular;
    
    void depositar(int deposito) {
        saldo+=deposito;
        System.out.println("Acabamos de depositar R$"+deposito+" à sua conta bancária");
    }
    void sacar(int saque) {
        saldo-=saque;
        System.out.println("Saque de R$"+saque+" realizado.");
    }
    void verSaldo() {
        System.out.println("Você tem um saldo atual de R$"+saldo+".");
    }
}
