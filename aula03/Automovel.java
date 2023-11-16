package aula03;

import java.util.Comparator;

public class Automovel {
    private String marca;
    private String modelo;
    private int quilometragem;
    private String placa;

    public Automovel(String marca, String modelo, int quilometragem, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.quilometragem = quilometragem;
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Quilometragem: " + quilometragem + ", Placa: " + placa;
    }
}

class ProviderPlaca implements Comparator<Automovel> {
    @Override
    public int compare(Automovel auto1, Automovel auto2) {
        return auto1.getPlaca().compareTo(auto2.getPlaca());
    }
}
