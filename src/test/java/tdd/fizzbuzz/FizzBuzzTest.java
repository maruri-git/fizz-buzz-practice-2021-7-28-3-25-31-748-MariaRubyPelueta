package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_fizz_when_countOff_given_3() {
        //given
        int input = 3;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String output = fizzbuzz.countOff(input);
        //then
        assertEquals(output, "Fizz");
    }

    @Test
    void should_return_buzz_when_countOff_given_5() {
        //given
        int input = 5;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String output = fizzbuzz.countOff(input);
        //then
        assertEquals(output, "Buzz");
    }
}
