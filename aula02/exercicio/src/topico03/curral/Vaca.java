package topico03.curral;

public class Vaca {

    String nome;
    String raca;
    int idade;
    double peso;

    public Vaca(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void pastar() {
        System.out.println("Pastando...");
    }

    public void mugir() {
        System.out.println("Muuuuuu");
    }

}
