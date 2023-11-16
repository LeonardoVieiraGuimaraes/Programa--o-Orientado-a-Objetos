package topico01;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        String p1 = "Antonio";
        String p2 = "Carlos";
        String p3 = "Juliano";
        String p4 = "Cesar";

        Set<String> conjunto = new HashSet<String>();
        conjunto.add(p1);
        conjunto.add(p2);
        conjunto.add(p3);
        conjunto.add(p4);

        for (String s : conjunto) {
            System.out.println(s);
        }

        if (conjunto.contains("Juliano")) {
            System.out.println("Juliano está no conjunto");
        }
        else {
            System.out.println("Juliano não está no conjunto");
        }
    }
}
