package topico01;

import java.util.HashMap;
import java.util.Map;

public class MainHashMap {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Antonio", "123456789");
        Pessoa p2 = new Pessoa("Carlos", "987654321");
        Pessoa p3 = new Pessoa("Juliano", "123456789");
        Pessoa p4 = new Pessoa("Cesar", "987654321");

        Map<String, Pessoa> map = new HashMap<String, Pessoa>();

        map.put(p1.getCPF(), p1);
        map.put(p2.getCPF(), p2);
        map.put(p3.getCPF(), p3);
        map.put(p4.getCPF(), p4);

        for (
                Map.Entry<String, Pessoa> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().getNome());
        }

        String cpf = "123456789";

        if (map.containsKey(cpf)) {
            System.out.println(map.get(cpf).getNome());
        }
    }
}
