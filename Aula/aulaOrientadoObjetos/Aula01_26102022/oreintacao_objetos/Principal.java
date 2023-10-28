package oreintacao_objetos;

public class Principal {

    public static void main(String[] args) {

        MeioDeTransporte navio = new MeioDeTransporte();

        navio.acenderLuzes();

        Carro carro = new Carro();
        carro.setAno(2019);
        carro.setCombustiveis("Gasolina");
        carro.setQtdeRodas(4);
        carro.acenderLuzes();
    }
}
