package junit5.tdd;

/**
 * @Author LINVI7
 * @Date 7/23/2020 11:36 AM
 * @Version 1.0
 */
public class Fizzbuzz {

    public String play(int number) {
        if (number % 3 == 0){
            return "bizz";
        }
        return String.valueOf(number);
    }
}
