package tdd.fizzbuzz;

public class FizzBuzz {
    public String FIZZ = "Fizz";
    public String BUZZ = "Buzz";
    public String countOff(int input) {
        if(input % 3 == 0) {
            return FIZZ;
        }
        if(input % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(input);
    }
}
