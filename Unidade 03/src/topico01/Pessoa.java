package topico01;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private String CPF;

    public Pessoa(String nome, String cpf) {
//        super();
        this.nome = nome;
        this.CPF = cpf;
    }
    public Pessoa() {
//
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(CPF, pessoa.CPF);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, CPF);
    }

//    @Override
//    public int hashCode() {
//
//        final int prime = 31;
//        int result = 1;
//        result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
//        return result;
//    }

    public int CompareTo(Pessoa arg0) {
        return this.getNome().compareTo(arg0.getNome());
    }

}
