package topico01.composicao;

public class MainAluno {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(123, "João", "Ciência da Computação");
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao(aluno);
        System.out.println("Nome: " + alunoGraduacao.getNome());
        System.out.println("Matricula: " + alunoGraduacao.getMatricula());
        System.out.println("Curso: " + alunoGraduacao.getCurso());

        Aluno aluno2 = new Aluno(456, "Maria", "Ciência da Computação");
        AlunoPosGraduacao alunoPosGraduacao = new AlunoPosGraduacao(aluno2, "UnB");
        System.out.println("Nome: " + alunoPosGraduacao.getNome());
        System.out.println("Matricula: " + alunoPosGraduacao.getMatricula());
        System.out.println("Curso: " + alunoPosGraduacao.getCurso());
        System.out.println("Instituição de Graduação: " + alunoPosGraduacao.getInstituicaoDeGraduacao());
    }
}
