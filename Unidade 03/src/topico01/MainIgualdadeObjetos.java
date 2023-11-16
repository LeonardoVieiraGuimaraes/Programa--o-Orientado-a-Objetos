package topico01;

public class MainIgualdadeObjetos {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Antonio", "123456789");
        Pessoa p2 = new Pessoa("Carlos", "987654321");
        Pessoa p3 = new Pessoa("Juliano", "123456789");
        Pessoa p4 = new Pessoa("Juliano", "123456789");

        if (p1==p2)
            System.out.println("p1 e p2 são iguais");
        else
            System.out.println("p1 e p2 são diferentes");

        if (p3==p4)
            System.out.println("p3 e p4 são iguais");
        else
            System.out.println("p3 e p4 são diferentes");

        int p5 = 5;
        int p6 = 3;

        p5 = p6;
        if(p5 == p6) {
            System.out.println("p5 e p6 são iguais");
        }
        else {
            System.out.println("p5 e p6 são diferentes");
        }

        if (p3.equals(p4))
            System.out.println("p3 e p4 são iguais");
        else
            System.out.println("p3 e p4 são diferentes");
    }
}
