import t01.ContaCorrente;
import t01.Correntista;
import t01.Fatorial;
// import t01.MecanismoDeAutenticacao;
import t02.Aluno;
import t02.AlunoDeGraduacao;
import t03.Copier;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Fatorial fatorial = new Fatorial();
        System.out.println(fatorial.calcularFatorial(10));

        Correntista c = new Correntista("Leonardo", "São Francisco");
        ContaCorrente cc = new ContaCorrente(1223, c);
        // cc.saldo = 500;
        // cc.numero = 123;
        // cc.correntista = "Outro"
        cc.depositar(450.90);

        // MecanismoDeAutenticacao mda = new MecanismoDeAutenticacao();

        Aluno a = new AlunoDeGraduacao(12, "Leonardo", "ADS");

        // a.matricula


        Double f1[] = new Double[50];
        Double f2[] = new Double[50];
        Copier<Double> cpDouble = new Copier<Double>();
        cpDouble.copy(f1,f2, 10);

        String s1[] = new String[20];
        String s2[] = new String[40];
        Copier<String> cpString = new Copier<String>();
        cpString.copy(s1,s2, 10);


        
    
    }
}
