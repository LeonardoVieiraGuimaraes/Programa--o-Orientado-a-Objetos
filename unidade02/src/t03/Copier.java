package t03;

public class Copier <T> {
    public void copy(T a[], T b[], int n){
        for(int i = 0 ; i < n ; i++)
            b[i] = a[i];
    }
}
