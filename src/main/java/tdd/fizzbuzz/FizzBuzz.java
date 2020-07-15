package tdd.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(Integer num) {
        String res;
        switch (num) {
            case 0:
                res = "";
                break;
            case 3:
                res = "Fizz";
                break;
            case 5:
                res = "Buzz";
                break;
            default:
                res = num.toString();
        }
        return res;
    }
}
