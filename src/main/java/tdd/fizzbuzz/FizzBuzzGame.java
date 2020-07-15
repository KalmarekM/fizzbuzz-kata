package tdd.fizzbuzz;

public class FizzBuzzGame {
    public String play(Integer number) {
        String res = "";
        for (Integer i = 1; i <= number; i++) {
            res += new FizzBuzz().fizzBuzz(i) + addComma(number, i);
        }
        return res;
    }

    private String addComma(Integer number, Integer i) {
        return !i.equals(number) ? "," : "";
    }
}
