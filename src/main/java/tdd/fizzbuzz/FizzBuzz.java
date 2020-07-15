package tdd.fizzbuzz;

public class FizzBuzz {

    public String fizzBuzz(Integer num) {
        String res;
        if(num == 0){
            res = "";
        } else if(num % 3 == 0 && num % 5 == 0){
            res = "FizzBuzz";
        } else if(num % 3 == 0){
            res = "Fizz";
        } else if(num % 5 == 0){
            res = "Buzz";
        } else {
            res = num.toString();
        }
        return res;
    }
}
