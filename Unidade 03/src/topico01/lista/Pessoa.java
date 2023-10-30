package topico01.lista;



public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { // getter
        return nome;
    }

    public void setNome(String nome) { // setter
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    @Override
    public int compareTo(Pessoa o) {
        return this.getNome().compareTo(o.getNome());
    }

}
