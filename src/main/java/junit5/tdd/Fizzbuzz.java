package junit5.tdd;

/**
 * @Author LINVI7
 * @Date 7/23/2020 11:36 AM
 * @Version 1.0
 */
public class Fizzbuzz {

    public String play(int number) {

        if (number % 3 == 0 && number % 5 == 0){
            return "bizzbuzz";
        }

        if (number % 3 == 0 && number % 7 == 0){
            return "fizzwhizz";
        }

        if (number % 3 == 0) {
            return "bizz";
        }

        if (number % 5 == 0) {
            return "buzz";
        }

        if (number % 7 == 0){
            return "whizz";
        }

        return String.valueOf(number);
    }
}
