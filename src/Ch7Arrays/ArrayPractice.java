package Ch7Arrays;

import java.util.Arrays;

        import static java.lang.Math.*;

public class ArrayPractice {
    public static void randomArray() {
        int randomSize = (int) (Math.random()*10)+1;
        int[] numbers = new int[randomSize];
        for (int i = 0; i <= numbers.length; i++) {
            numbers[i] = (int) (Math.random()*10)+1;
        }
        System.out.print((Arrays.toString(numbers)));

    }
}
