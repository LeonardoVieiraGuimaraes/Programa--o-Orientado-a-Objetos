import encapsulamento.ContaBancaria;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

      
        ContaBancaria conta = new ContaBancaria(1000);

        conta.depositar(4000);
        System.out.println(conta.getSaldo());

    }
}
