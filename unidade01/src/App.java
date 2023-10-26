import t01.Fatorial;
import t02.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println(Fatorial.fatorial(5));

        Pessoa p1 = new Pessoa();

        p1.nome = "João";
        p1.CPF = "05889763695";
        p1.sexo = "M";

        if (p.validarCPF(p1.CPF)){
            System.out.println("CPF válido");
        }
        else{
            System.out.println("CPF inválido");
        }

        p1.imprimirNome();

    }
}
