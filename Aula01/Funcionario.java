package Aula01;

public class Funcionario {
    String nome;
    double salario;
    String departamento;
    
    void aumentarSalario(int percentual) {
        salario+=(salario/100)*percentual;
        System.out.println("Acabamos de aumentar o salário de "+nome+" em "+percentual+"%");
    }
}
