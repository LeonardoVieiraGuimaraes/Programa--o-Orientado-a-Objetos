package topico03.canil;

public class Main {
    public static void main(String[] args) {
        Cachorro meuCachorro1 = new Cachorro();

        meuCachorro1.nome = "Rex";
        meuCachorro1.raca = "Poodle";
        meuCachorro1.peso = 5.0;

        meuCachorro1.latir();

        System.out.println("Nome: " + meuCachorro1.nome);
        System.out.println("Raça: " + meuCachorro1.raca);
        System.out.println("Peso: " + meuCachorro1.peso);

    }

}
