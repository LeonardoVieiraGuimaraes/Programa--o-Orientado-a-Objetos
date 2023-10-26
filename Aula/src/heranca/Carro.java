// Exemplo 1: Herança Simples
package heranca;

class Carro extends Veiculo {
    int numeroPortas;

    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numeroPortas = numeroPortas;
    }

    public void abrirPorta() {
        System.out.println("A porta do carro está aberta.");
    }
}