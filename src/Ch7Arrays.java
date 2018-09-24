import java.util.Arrays;

public class Ch7Arrays {
    public static void main(String []args) {
        //step 1: declare an array
        int[] numbers = new int[10];    //an array of 10 integers
        System.out.println(Arrays.toString(numbers));

        //step 2: initialize an array
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        //declare and initialize an array
        int[] num = {1,2,3,4,5,6,7,8,9,10};

    }
}
