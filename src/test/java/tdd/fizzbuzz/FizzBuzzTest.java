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

    @Test
    void should_return_whizz_when_countOff_given_7() {
        //given
        int input = 7;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String output = fizzbuzz.countOff(input);
        //then
        assertEquals(output, "Whizz");
    }

    @Test
    void should_return_fizz_buzz_when_countOff_given_15() {
        //given
        int input = 15;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String output = fizzbuzz.countOff(input);
        //then
        assertEquals(output, "FizzBuzz");
    }
    void should_return_fizz_whizz_when_countOff_given_21() {
        //given
        int input = 21;
        FizzBuzz fizzbuzz = new FizzBuzz();
        //when
        String output = fizzbuzz.countOff(input);
        //then
        assertEquals(output, "FizzWhizz");
    }

}
