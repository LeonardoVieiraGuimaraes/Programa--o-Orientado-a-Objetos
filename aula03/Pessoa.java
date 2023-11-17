package aula03;

public class Pessoa {
    private String nome;
    private Sexo sexo;

    public Pessoa(String nome, Sexo sexo) {
        // super();
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }
}