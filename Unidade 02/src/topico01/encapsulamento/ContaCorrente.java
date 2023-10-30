package topico01.encapsulamento;

public class ContaCorrente {

//    String correntista;
//    double saldo;
//    int numero;

//    adiconando private
    private Correntista correntista;
    private double saldo;
    private int numero;

    public ContaCorrente(int nro, Correntista corr){
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

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public void sacar (double valor){
        if (existeSaldo(valor) == true)
            saldo = saldo - valor;
    }

    private boolean existeSaldo(double valor){
        if (valor <= saldo)
            return true;
        else
            return false;
    }


}
