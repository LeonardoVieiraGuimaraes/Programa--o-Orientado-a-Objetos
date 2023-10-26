package t01;

public class ContaCorrente {

    private Correntista correntista;
    private double saldo;
    private int numero;
    

    public ContaCorrente(int nro, Correntista corr) {
        numero = nro;
        correntista = corr;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }


    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    private boolean existeSaldo(double valor) {
        if (saldo >= valor) {
            return true;
        } else {
            return false;
        }
    }

}
