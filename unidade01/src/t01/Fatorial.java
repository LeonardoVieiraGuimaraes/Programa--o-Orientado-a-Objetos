package t01;

public class Fatorial {
    
    public static final int fatorial(int n){
        return(n== 0) ? 1 : n * fatorial(n-1);
    }
}
