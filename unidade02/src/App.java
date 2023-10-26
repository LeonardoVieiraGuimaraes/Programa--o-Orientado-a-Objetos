import t01.ContaCorrente;
import t01.Correntista;
import t01.Fatorial;
// import t01.MecanismoDeAutenticacao;
import t02.Aluno;
import t02.AlunoDeGraduacao;

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
    
    }
}
