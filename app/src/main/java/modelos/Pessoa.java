package modelos;

public class Pessoa {
    protected String nome;
    private static int count;

    public static void addCount() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {}
}