package t02;

public class AlunoDePosGraduacao extends Aluno{
    private String insituicaoDeGraduacao;

    public AlunoDePosGraduacao(int matricula, String nome, String curso, String inst) {
        super(matricula, nome, curso);
        this.insituicaoDeGraduacao = inst;
    }

    public String getinsituicaoDeGraduacao() {
        return insituicaoDeGraduacao;
    }
    
}
