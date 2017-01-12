package fibo2;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by Jola on 2017-01-05.
 */
public class FibonaciTest {
    @Test
    public void fiboTtest2() {
        Fibonaci22 fibo2 = new Fibonaci22();
        assertThat(fibo2.ciagFibonacci(2)).isEqualTo(1);
    }

    @Test
    public void fiboTtest10() {
        Fibonaci22 fibo2 = new Fibonaci22();
        assertThat(fibo2.ciagFibonacci(10)).isEqualTo(55);
    }

    @Test
    public void fiboTtest14() {
        Fibonaci22 fibo2 = new Fibonaci22();
        assertThat(fibo2.ciagFibonacci(14)).isEqualTo(377);
    }

    @Test
    public void fiboTtest15() {
        Fibonaci22 fibo2 = new Fibonaci22();
        assertThat(fibo2.ciagFibonacci(15)).isEqualTo(610);
    }
}
