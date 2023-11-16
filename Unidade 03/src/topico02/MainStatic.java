package topico02;

public class MainStatic {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(123);
        c1.setTaxa_juros(0.1);

        ContaCorrente c2 = new ContaCorrente(456);
        c2.setTaxa_juros(0.2);

        System.out.println(c1.getTaxa_juros());
        System.out.println(c2.getTaxa_juros());

    }
}
