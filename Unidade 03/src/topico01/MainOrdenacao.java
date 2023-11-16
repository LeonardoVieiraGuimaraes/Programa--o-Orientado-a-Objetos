package topico01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainOrdenacao {
    public static void main(String[] args) {


        PessoaComparator p1 = new PessoaComparator("Antonio", "123456789", 1.80);
        PessoaComparator p2 = new PessoaComparator("Carlos", "987654321", 1.90);
        PessoaComparator p3 = new PessoaComparator("Juliano", "123456789", 1.70);
        PessoaComparator p4 = new PessoaComparator("Cesar", "987654321", 1.60);
        PessoaComparator p5 = new PessoaComparator("Leonardo", "024242424", 1.50);

        List<PessoaComparator> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
        list1.add(p4);
        list1.add(p5);

        Collections.sort(list1);
        for (PessoaComparator pessoa : list1) {
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getCpf());
        }
    }
}
