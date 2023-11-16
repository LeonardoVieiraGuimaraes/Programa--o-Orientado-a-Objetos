package topico03.heranca;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro01 = new Carro("Fuca", 1970, "Azul", 2);

        meuCarro01.abrirPortas();

        System.out.println("Informaçãoes do Carro: " + meuCarro01.oberInformacoes());

        Moto minhamoto01 = new Moto("Honda", 2022, "Preto", 250);
        minhamoto01.partidaEletrica();
        System.out.println("Informaçãoes da Moto: " + minhamoto01.oberInformacoes());

    }

}
