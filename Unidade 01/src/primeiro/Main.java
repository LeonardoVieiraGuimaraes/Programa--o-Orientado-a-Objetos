package primeiro;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = "Leonardo Vieira";
        p.CPF = 12152541;
        p.sexo = "Masculino";
        p.imprimirNome();

        Pessoa p1 = new Pessoa();
        p1.nome = "Maria José";
        p1.CPF = 0551515151;
        p1.sexo = "Feminino";
        p1.imprimirNome();

        Pessoa p2 = new Pessoa();
        int cpf = 202020;


//        p2.imprimirNome();

        if (p2.validarCPF(cpf) == true){
            p2.CPF = cpf;
            p2.nome = "João";
            p2.sexo = "Masculino";
        }
        p2.imprimirNome();
    }
}
