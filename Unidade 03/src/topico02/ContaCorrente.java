package topico02;

public class ContaCorrente {
    private double saldo;
    private int numero;
    private static double taxa_juros;

    public static double getTaxa_juros() {
        return taxa_juros;
    }

    public static void setTaxa_juros(double taxa_juros) {
//        if (saldo > 0) {
//            topico02.ContaCorrente.taxa_juros = taxa_juros;
//        }
        ContaCorrente.taxa_juros = taxa_juros;
    }

    public ContaCorrente(int numero) {
        this.numero = numero;
    }



}
