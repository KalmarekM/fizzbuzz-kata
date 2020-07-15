package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class FizzBuzzGameTest {
    @Test
    void returnEmptyString0() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String res = fizzBuzzGame.play(0);
        assertThat(res).isEqualTo("");
    }

    @Test
    void returnResultString1() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String res = fizzBuzzGame.play(1);
        assertThat(res).isEqualTo("1");
    }

    @Test
    void returnResultStringTo3() {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame();
        String res = fizzBuzzGame.play(3);
        assertThat(res).isEqualTo("1,2,Fizz");
    }
}
