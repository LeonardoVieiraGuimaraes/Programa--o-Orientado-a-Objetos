package topico01;

public class Microondas extends Produtos{

    private String cor;
    private int voltagem;
    private int capacidade;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public boolean isAutolimpante() {
        return autolimpante;
    }

    public void setAutolimpante(boolean autolimpante) {
        this.autolimpante = autolimpante;
    }

    private boolean autolimpante;

    public void promocao (){
        System.out.println("Este Produto microondas está promoção com 10%");
    }
}
