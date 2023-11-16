package veterinario.canil;

public class Cachorro {
    public String nome;
    public String raca;
    public double peso;

    public void cocar(){

    }

    public void latir(){
        System.out.println("au...au...au");
    }

    public boolean engordar(int p){
        if (peso >=20)
                return true;
        else
            return false;
    }
}
