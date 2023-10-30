package topico02.metodoestaticos;

public class MetodoEstatico {

    public static int somar(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
//        MetodoEstatico m = new MetodoEstatico();
        System.out.println(MetodoEstatico.somar(2,6));
    }
}
