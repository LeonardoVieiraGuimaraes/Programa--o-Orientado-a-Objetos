package t02;

public class Pessoa {
    
    public int CPF;
    public String sexo; 
    public String nome;

    public void imprimirNome(){
        System.out.println("Nome: " + nome);
    }

    boolean validarCPF(int cpf){
        boolean retorno = false;
        if (cpf !=0){
            retorno = true;
        }
        else{
            retorno = false;
        }
        return retorno;
    }
}
