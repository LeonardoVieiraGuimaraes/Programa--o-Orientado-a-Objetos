package topico03.heranca;

public class Veiculo {
    private String modelo;
    private int anoFrabriação;
    private String cor;

    public Veiculo(String modelo, int anoFrabriação, String cor) {
        this.modelo = modelo;
        this.anoFrabriação = anoFrabriação;
        this.cor = cor;
    }

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void desligar() {
        System.out.println("Desligando...");
    }

    public String oberInformacoes() {
        return "Modelo: " + this.modelo + "\nAno de Fabricação: " + this.anoFrabriação + "\nCor: " + this.cor;
    }

}
