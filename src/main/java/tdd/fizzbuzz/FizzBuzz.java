package tdd.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(Integer num) {
        switch (num) {
            case 3:
                return "Fizz";
            case 5:
                return "Buzz";
            default:
                return num.toString();
        }
    }
}
