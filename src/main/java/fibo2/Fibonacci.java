package fibo2;

/**
 * Created by Jola on 2017-01-05.
 */
public class Fibonacci {
    // pobranie argumentu z klasy Fibo 2 i oblliczenie liczby n - ciągu
    public int ciagFibonacci(int n) {
        int fibo[] = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 2; i <= n; i++) {
            fibo[i] = (fibo[i - 1]) + (fibo[i - 2]);
        }
        return fibo[n];
    }
}