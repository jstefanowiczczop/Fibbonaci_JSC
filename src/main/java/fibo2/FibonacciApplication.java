package fibo2;

import java.util.Scanner;

/**
 * Created by Jola on 2017-01-05.
 */
public class FibonacciApplication {
    public static int n;

    public static void main(String[] args) {
        Fibonacci fibo2 = new Fibonacci();

        Scanner odczyt = new Scanner(System.in);
        System.out.println("POdaj liczbe n ciągu fibonacciegi i nacisnij enter: ");
        int n = odczyt.nextInt();
        System.out.println(" Wynik dla podanej liczby: " + fibo2.ciagFibonacci(n));
    }
}
