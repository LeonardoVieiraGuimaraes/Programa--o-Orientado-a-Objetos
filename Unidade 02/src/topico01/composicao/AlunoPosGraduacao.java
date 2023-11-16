package topico01.composicao;

public class AlunoPosGraduacao {
    private Aluno aluno;
    private String instituicaoDeGraduacao;

    public AlunoPosGraduacao(Aluno aluno, String instituicaoDeGraduacao) {
        this.aluno = aluno;
        this.instituicaoDeGraduacao = instituicaoDeGraduacao;
    }

    public String getInstituicaoDeGraduacao() {
        return instituicaoDeGraduacao;
    }

    public void setInstituicaoDeGraduacao(String instituicaoDeGraduacao) {
        this.instituicaoDeGraduacao = instituicaoDeGraduacao;
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
