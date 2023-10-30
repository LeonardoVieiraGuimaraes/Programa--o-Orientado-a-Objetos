package topico02.atributosestaticos;

public class Cidades {
//    public String cidade = "Blumenau";
    public static  String cidade = "Blumenau";

    public static void main(String[] args) {

        Cidades c1 = new Cidades();
        Cidades c2 = new Cidades();

        System.out.println(c1.cidade);
        System.out.println(c2.cidade);

        c1.cidade = "Indaial";
        c2.cidade = "São Paulo";

        System.out.println("");
        System.out.println(c1.cidade);
        System.out.println(c2.cidade);


        System.out.println("");
        System.out.println(Cidades.cidade);




    }

}
