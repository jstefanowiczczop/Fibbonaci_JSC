package fibo2;
import static fibo2.Fibo2.n;

/**
 * Created by Jola on 2017-01-05.
 */
public class Fibonaci22 {

// pobranie argumentu z klasy Fibo 2 i oblliczenie liczby n - ciągu
    public int ciagFibonacci(int n) {

       int i;

        int fibo[] = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1]) + (fibo[i - 2]);
            int a = fibo[n];
        }
        return fibo[n];

    }
}