package tdd.fizzbuzz;

public class FizzBuzzGame {

    public static void main(String[] args){
        System.out.println("play = " + new FizzBuzzGame().play(25));
    }

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
