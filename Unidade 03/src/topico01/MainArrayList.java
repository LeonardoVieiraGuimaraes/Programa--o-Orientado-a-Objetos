package topico01;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();

        list.add("Antonio");
        list.add("Carlos");
        list.add("Juliano");
        list.add("Cesar");

        list.remove("Juliano");

        for(String s : list) {
            System.out.println(s);
        }

        List<Pessoa> list1 = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa("Antonio", "123456789");
        Pessoa p2 = new Pessoa("Carlos", "987654321");
        Pessoa p3 = new Pessoa("Juliano", "123456789");
        Pessoa p4 = new Pessoa("Cesar", "987654321");

        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
        list1.add(p4);

        list1.remove(p3);

        for(Pessoa p : list1) {
            System.out.println(p.getNome());
            System.out.println(p.getCPF());
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i).getNome());
            System.out.println(list1.get(i).getCPF());
        }
    }
}
