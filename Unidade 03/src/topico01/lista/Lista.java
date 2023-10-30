package topico01.lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<String>();

        lista.add("Maria");
        lista.add("João");
        lista.add("José");
        lista.add("Pedro");

        for (String s : lista) {
            System.out.println("Nome: " + s);
        }

        lista.remove("João");

        System.out.println("Lista após remoção: ");

        for (String s : lista) {
            System.out.println("Nome: " + s);
        }



    }


}
