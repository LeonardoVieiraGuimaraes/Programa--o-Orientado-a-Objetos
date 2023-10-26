package t02;

public class Passeiro {

    private int numeroSimples;
    private Pessoa pessoa;

    public int getNumeroSimples() {
        return numeroSimples;
    }
    public void setNumeroSimples(int numeroSimples) {
        this.numeroSimples = numeroSimples;
    }
    // public Pessoa getPessoa() {
    //     return pessoa;
    // }
    // public void setPessoa(Pessoa pessoa) {
    //     this.pessoa = pessoa;
    // }

    public String getNome() {
        return pessoa.getNome();
    }

    public void setNome(String nome) {
        this.pessoa.setNome(nome);
    }


    
}
