package fibo2;

import java.util.Scanner;

/**
 * Created by Jola on 2017-01-05.
 */
public class Fibo2 {
    public static int n;

    public static void main(String[] args) {
        Fibonaci22  fibo2 = new Fibonaci22();

        Scanner odczyt = new Scanner(System.in);
        System.out.println("POdaj liczbe n ciągu fibonacciegi i nacisnij enter: ");
        int n = odczyt.nextInt();
        System.out.println(" Wynik dla podanej liczby: " + fibo2.ciagFibonacci(n));

    }

}
