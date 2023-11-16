package topico01.lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPessoa {
    public static void main(String[] args) {
        List<Pessoa> lista = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa("Maria", 20);
        Pessoa p2 = new Pessoa("João", 30);
        Pessoa p3 = new Pessoa("José", 40);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);

        for (Pessoa p: lista) {
            System.out.println("Nome: " + p.getNome() + " - Idade: " + p.getIdade());
        }

        Collections.sort(lista);

        for (Pessoa p : lista) {
            System.out.println("Nome: " + p.getNome() + " - Idade: " + p.getIdade());
        }
    }
}
