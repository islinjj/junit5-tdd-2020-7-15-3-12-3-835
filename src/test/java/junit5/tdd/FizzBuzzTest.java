package junit5.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author LINVI7
 * @Date 7/23/2020 11:26 AM
 * @Version 1.0
 */
public class FizzBuzzTest {

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

}
