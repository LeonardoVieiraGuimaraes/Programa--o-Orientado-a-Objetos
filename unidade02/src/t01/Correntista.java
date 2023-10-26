package t01;

public class Correntista {

    private String endereco, nome;

    public Correntista(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getCorrentista() {
        return nome;
    }

    public void setEndereco(String end) {
        endereco = end;
    }

    public String getEndereco() {
        return endereco;
    }

}
