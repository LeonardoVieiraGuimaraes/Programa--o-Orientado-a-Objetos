package topico03.heranca;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String modelo, int anoFabricacao, String cor, int cilindradas) {
        super(modelo, anoFabricacao, cor);
        this.cilindradas = cilindradas;
    }

    public void partidaEletrica() {
        // Implementação da partida elétrica
    }

    public void desligarMotor() {
        // Implementação para desligar o motor da moto
    }
}
