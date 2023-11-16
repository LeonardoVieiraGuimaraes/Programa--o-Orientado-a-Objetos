package topico01.encapsulamento;

public class ContaCorrenteMain {
    public static void main(String[] args) {
//        ContaCorrente cc = new ContaCorrente(1233, c);
//        cc.saldo = 500;
//        cc.numero = 3432;
//        cc.correntista = "Ouro Correntista";

        Correntista c = new Correntista("Leonardo", "Universidade");
        ContaCorrente cc = new ContaCorrente(23331, c);
        cc.depositar(450.90);
    }
}
