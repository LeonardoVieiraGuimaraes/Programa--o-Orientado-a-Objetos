import aulau1t1.Pessoa;
// import encapsulamento.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

      
        // ContaBancaria conta = new ContaBancaria(1000);

        // conta.depositar(4000);
        // System.out.println(conta.getSaldo());

        Pessoa p1 = new Pessoa(20, "Leonardo", "123456789");

        System.out.println(p1.getNome());

    }
}
