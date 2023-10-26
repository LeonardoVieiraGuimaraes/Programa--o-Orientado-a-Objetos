// Encapsulamento Básico com Campos Privados:

package encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int novaIdade) {
        if (novaIdade >= 0) {
            idade = novaIdade;
        }
    }
}
