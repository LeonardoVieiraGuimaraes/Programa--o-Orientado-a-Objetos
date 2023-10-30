package topico01;

public class Main {

    public static void main(String[] args){

        Computadores comp = new Computadores();
        comp.setPreco(1200.00);
        comp.setMemoria(4);

        Microondas micro = new Microondas();
        micro.setMarca("LG");
        micro.setAutolimpante(true);

        System.out.println("Preço Computador " + comp.getPreco());
        System.out.println("Marca Microondas" + micro.getMarca());

        comp.promocao();
        micro.promocao();


    }
}
