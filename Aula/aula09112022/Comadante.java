public class Comadante {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setAno(2019);
        carro.setCombustivel("Gasolina");
        carro.setQuantidadeRodas(4);

        System.out.println(carro.getAno());
        System.out.println(carro.getCombustivel());

        Navio navio = new Navio();
        navio.acenderLuzes();

        carro.acenderLuzes();

    }

}
