package Aula01;

public class Aluno {
    String nome;
    int matricula;
    double[] notas = new double[4];
    
    double calcularMedia() {
        double media = (notas[0]+notas[1]+notas[2]+notas[3])/4;
        return media;
    }
}
