package tdd.fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void returnNumber1(){

        String fizzBuzzRes = fizzBuzz.fizzBuzz(1);

        assertThat(fizzBuzzRes).isEqualTo("1");
    }

    @Test
    void returnNumber2() {

        String fizzBuzzRes = fizzBuzz.fizzBuzz(2);

        assertThat(fizzBuzzRes).isEqualTo("2");
    }

    @Test
    void returnNumber3() {

        String fizzBuzzRes = fizzBuzz.fizzBuzz(3);

        assertThat(fizzBuzzRes).isEqualTo("Fizz");
    }

    @Test
    void returnNumber5() {

        String fizzBuzzRes = fizzBuzz.fizzBuzz(5);

        assertThat(fizzBuzzRes).isEqualTo("Buzz");
    }
}
