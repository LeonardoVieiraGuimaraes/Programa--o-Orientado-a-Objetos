package topico01;

class PessoaComparator implements Comparable<PessoaComparator> {
    private String nome;
    private String cpf;
    private double altura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public PessoaComparator(String nome, String cpf, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public String getCpf() {
        return cpf;
    }

//    public void setCpf(String cpf) {
//        this.cpf = cpf;
//    }


    @Override
    public String toString() {
        return "topico01.Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }


    @Override
    public int compareTo(PessoaComparator other) {
        return this.nome.compareTo(other.getNome());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
