package tdd.fizzbuzz;

public class FizzBuzz {
    public String FIZZ = "Fizz";
    public String BUZZ = "Buzz";
    public String WHIZZ = "Whizz";
    public String countOff(int input) {
        StringBuilder multipleBy2Numbers = new StringBuilder();

        multipleBy2Numbers
                .append(Fizz(input) ? FIZZ : "")
                .append(Buzz(input) ? BUZZ : "")
                .append(Whizz(input)? WHIZZ: "");

        return String.valueOf(multipleBy2Numbers.toString());
    }

    public boolean Fizz(int input) {
        return input % 3 == 0;
    }

    public boolean Buzz(int input) {
        return input % 5 == 0;
    }

    public boolean Whizz(int input) {
        return input % 7 == 0;
    }
}
