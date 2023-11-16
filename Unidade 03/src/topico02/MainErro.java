package topico02;

public class MainErro {
    public static void main(String[] args) {
        System.out.println("Inicio topico02.Main");
        metodo1();
        System.out.println("Fim topico02.Main");
    }

    static void metodo1() {
        System.out.println("Inicio metodo1");
        metodo2();
        System.out.println("Fim metodo1");
    }

    static void metodo2() {
        System.out.println("Inicio metodo2");
        int[] array = new int[10];
        try {
            for (int i = 0; i <= 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Capiturei o erro e continue a execução: " + e);
        }
        System.out.println("Fim metodo2");
    }
}
