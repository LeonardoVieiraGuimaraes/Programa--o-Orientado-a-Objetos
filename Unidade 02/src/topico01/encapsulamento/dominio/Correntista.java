package topico01.encapsulamento.dominio;

public class Correntista {

    private String nome, endereco;

    public Correntista(String corr, String end){
        nome = corr;
        endereco = end;

    }

    public String getCorrentista(){
        return nome;
    }
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }
}
