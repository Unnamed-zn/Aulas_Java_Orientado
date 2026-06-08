package Aula01;

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponivel = true;
    
    void emprestar() {
        disponivel = false;
        System.out.println("Você acabou de emprestar o livro "+titulo+", agora ele está indisponível.");
    }
    
    void devolver() {
        disponivel = true;
        System.out.println("Acabaram de devolter o livro "+titulo+", agora ele está disponível de volta.");
    }
}
