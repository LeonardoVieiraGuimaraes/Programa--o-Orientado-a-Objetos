package topico01.composicao;

public class AlunoGraduacao {
    private Aluno aluno;

    public AlunoGraduacao(Aluno aluno) {
        this.aluno = aluno;
    }

    public String getNome() {
        return aluno.getNome();
    }

    public int getMatricula() {
        return aluno.getMatricula();
    }

    public String getCurso() {
        return aluno.getCurso();
    }
}
