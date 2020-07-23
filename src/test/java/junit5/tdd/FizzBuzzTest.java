package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author LINVI7
 * @Date 7/23/2020 11:26 AM
 * @Version 1.0
 */
public class FizzBuzzTest<TDD> {

    @Test
    public void should_return_1_when_count_off_given_1(){
        //given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        int number = 1;

        //when
        String result = fizzbuzz.play(number);

        //then
        assertEquals("1",result);
    }

    @Test
    public void should_return_bizz_when_count_off_given_3() {
        //given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        int number = 3;

        //when
        String result = fizzbuzz.play(number);

        //then
        assertEquals("bizz",result);
    }

    @Test
    public void should_return_buzz_when_count_off_give_5() {
        //given
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        int number = 5;

        //when
        String result = fizzbuzz.play(number);

        //then
        assertEquals("buzz",result);
    }

    @Test
    public void should_return_bizz_buzz_when_count_off_give_3_and_5_multiples() {
        //give
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        int number = 15;

        //when
        String result = fizzbuzz.play(number);

        //then
        assertEquals("bizzbuzz",result);
    }

    @Test
    public void should_return_whizz_when_count_off_given_multiple_of_7() {
        //give
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        int number = 7;

        //when
        String result = fizzbuzz.play(number);

        //then
        assertEquals("whizz",result);
    }
}
