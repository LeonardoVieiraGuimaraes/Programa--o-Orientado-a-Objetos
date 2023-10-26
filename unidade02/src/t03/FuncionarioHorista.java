package t03;

public class FuncionarioHorista extends Funcionario{
        
 private double valorHora;
 private double horasTrabalhadas;

 public FuncionarioHorista(String nome, double valorHora, double horasTrabalhadas) {
     super(nome);
     this.valorHora = valorHora;
     this.horasTrabalhadas = horasTrabalhadas;
 }

 @Override
 public double calcularSalario() {
     return valorHora * horasTrabalhadas;
 }
    
}
