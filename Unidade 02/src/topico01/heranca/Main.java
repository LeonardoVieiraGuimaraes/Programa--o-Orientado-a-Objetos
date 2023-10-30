package topico01.heranca;

public class Main{

        public static void main(String[] args) {

            Aluno a = new AlunoDeGraduacao(1233, "Peter Paker", "Biologia");

            System.out.println("Nome: " + a.getNome());
            System.out.println("Matricula: " + a.getMatricula());
            System.out.println("Curso: " + a.getCurso());
            a.setCurso("Engenharia");
            System.out.println("Curso: " + a.getCurso());


            Aluno b = new AlunoDePosGraduacao(1234, "Bruce Wayne", "Engenharia", "UnB");

            System.out.println("Nome: " + b.getNome());
            System.out.println("Matricula: " + b.getMatricula());
            System.out.println("Curso: " + b.getCurso());
            System.out.println("Instituição de Graduação: " + ((AlunoDePosGraduacao) b).getCursoDeGraduacao());

        }
}
