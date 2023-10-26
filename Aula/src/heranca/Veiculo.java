package heranca;

class Veiculo {
    String marca;
    int ano;

    public Veiculo(String marca, int ano) {
        this.marca = marca;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando.");
    }
}