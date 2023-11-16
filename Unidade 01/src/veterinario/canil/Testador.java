package veterinario.canil;

public class Testador {
    public static void main(String[] arg) {

//        Instaciar um objetido do tipo Cachorro
        Cachorro c1 = new Cachorro();

//        Atribuir valores para os atributos do objeto
        c1.nome = "Rex";
        c1.raca = "Labrador";

        c1.peso = 30;

//        Invoar o métodor latir() do objeto instanciando
        c1.latir();

        boolean r1 = c1.engordar(30);
        System.out.println(r1);

    }
}
