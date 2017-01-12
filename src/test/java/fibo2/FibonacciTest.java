package fibo2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Jola on 2017-01-05.
 */
public class FibonacciTest {
    @Test
    public void fiboTtest2() {
        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.ciagFibonacci(2)).isEqualTo(1);
    }

    @Test
    public void fiboTtest10() {
        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.ciagFibonacci(10)).isEqualTo(55);
    }

    @Test
    public void fiboTtest14() {
        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.ciagFibonacci(14)).isEqualTo(377);
    }

    @Test
    public void fiboTtest15() {
        Fibonacci fibonacci = new Fibonacci();
        assertThat(fibonacci.ciagFibonacci(15)).isEqualTo(610);
    }
}
