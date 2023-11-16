package aula03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testador {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel("Porsche", "Carrera", 1234, "ABC-4321");
        Automovel auto2 = new Automovel("VW", "Brasilia", 178987, "EEE-8765");
        Automovel auto3 = new Automovel("Ford", "Fiesta", 234590, "QKI-4999");

        List<Automovel> lista = new ArrayList<>();
        lista.add(auto3);
        lista.add(auto1);
        lista.add(auto2);

        // Ordena a lista usando o ProviderPlaca
        Collections.sort(lista, new ProviderPlaca());

        // Exibe os automóveis ordenados
        for (Automovel automovel : lista) {
            System.out.println(automovel);
        }
    }
}
