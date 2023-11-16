package topico02.excecoes;

public class Excecoes {

    static int numeros[] = new int[5];

    static void popularVetor() {
        for (int i = 0; i <= numeros.length; i++) {
            try {
                numeros[i] = i+1;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Erro neste método " + e);
            }

        }
        System.out.println("Vetor populado com sucesso!");
    }

    static void mostrarVetor() {
        for (int i = 0; i < numeros.length; i++) {

            try {
                System.out.println(numeros[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Erro neste método " + e);
            }
        }
        System.out.println("Vetor mostrado com sucesso!");
    }


    public static void main(String[] args) {
        popularVetor();
        mostrarVetor();
    }
}
