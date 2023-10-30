package topico01.encapsulamento;
public class Fatorial {
    public int calculaFatorial(int valor){
        if(valor  == 0)
            return 1;
        return valor*calculaFatorial(valor -1);
    }
}