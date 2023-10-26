// Encapsulamento com Restrições:

package encapsulamento;

public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        if (saldoInicial >= 0) {
            saldo = saldoInicial;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
}
