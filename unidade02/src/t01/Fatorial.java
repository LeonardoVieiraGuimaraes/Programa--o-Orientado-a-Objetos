package t01;

public class Fatorial {
    public int calcularFatorial(int valor){
        if (valor ==0)
        return 1;
        return valor * calcularFatorial(valor -1);
    }
    
}
