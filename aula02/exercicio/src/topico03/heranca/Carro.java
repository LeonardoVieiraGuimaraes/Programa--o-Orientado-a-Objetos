package topico03.heranca;

public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String modelo, int anoFabricacao, String cor, int quantidadePortas) {
        super(cor, quantidadePortas, cor);
        this.quantidadePortas = quantidadePortas;
    }

    public void abrirPortas() {
        System.out.println("Abrindo portas...");
    }

    public void travarCarro() {
        System.out.println("Travando carro...");
    }
}
