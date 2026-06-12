package Aula02.Exercicio4;

public class CartaPokemon {
    private String nome;
    private String tipo;
    private int hp;

    public CartaPokemon(String nome, String tipo, int hp) {
        this.nome = nome;
        this.tipo = tipo;
        this.hp = hp;
    }
    
    public CartaPokemon() {
        this.nome = "Pikachu";
        this.tipo = "Elétrico";
        this.hp = 60;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "CartaPokemon{" + "nome=" + nome + ", tipo=" + tipo + ", hp=" + hp + '}';
    }
    
    
}
