package tdd.fizzbuzz;

public class FizzBuzz {
    public String FIZZ = "Fizz";
    public String countOff(int input) {
        if(input % 3 == 0) {
            return FIZZ;
        }
        return String.valueOf(input);
    }
}
