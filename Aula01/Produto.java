package Aula01;

public class Produto {
    String nome;
    double preco;
    int quantiaEmEstoque;
    
    void vender(int quantia) {
        if (quantia>=0) {
            quantiaEmEstoque-=quantia;
            System.out.println("Acabamos de vender "+quantia+" unidades de "+nome+".");
        } else {
            System.out.println("Estoque insuficiente é necessário repor.");
        }
    }
    void reporEstoque(int quantia) {
        if (quantia>0) {
            quantiaEmEstoque+=quantia;
            System.out.println("Acabamos de repor "+quantia+" unidades de "+nome+" no estoque.");    
        } else if (quantia==0) {
            System.out.println("Impossível repor o estoque com 0 unidades.");
        } else {
            System.out.println("Impossível repor o estoque com quantidade negativa. Utilize o método vender() para reduzir o estoque.");
        }
    }
}
