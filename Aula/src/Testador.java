import dominio.Estudante;

public class Testador {
    public static void main(String[] args) throws Exception {
        
        Estudante est1 = new Estudante(1, "Leonardo");
        est1.setNome("João");

        System.out.println(est1.getNome());


        Estudante est2 = new Estudante(2, "Leonardo 2");
        est2.setNome("Maria"); 

        Estudante est3 = new Estudante(3, "Leonardo 3");
      
    }
}