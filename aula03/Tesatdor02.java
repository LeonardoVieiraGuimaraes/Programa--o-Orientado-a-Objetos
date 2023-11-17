package aula03;

public class Tesatdor02 {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("João", Sexo.MASCULINO);

        Pessoa pessoa2 = new Pessoa("Maria", Sexo.FEMININO);

        System.out.println(pessoa1.getNome() + " é " + pessoa1.getSexo());
        System.out.println(pessoa2.getNome() + " é " + pessoa2.getSexo());

    }
}
