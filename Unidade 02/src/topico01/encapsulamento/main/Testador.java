package topico01.encapsulamento.main;


import topico01.encapsulamento.autenticacao.MecamismoDeAutenticacao;
import topico01.encapsulamento.ContaCorrente;
import topico01.encapsulamento.Correntista;

public class Testador {
    public static void main(String[] args){
        Correntista c = new Correntista("Leonardo", "Universidade");
        ContaCorrente cc = new ContaCorrente(23331, c);
        cc.depositar(450.90);

        MecamismoDeAutenticacao mda = new MecamismoDeAutenticacao();

    }
}
