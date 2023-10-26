package aulau1t1;

public class Pessoa {

    int idade;
    String nome;
    String cpf;

    
    public Pessoa(int idade, String nome, String cpf) {
        this.idade = idade;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
