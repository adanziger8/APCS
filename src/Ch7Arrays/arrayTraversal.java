package Ch7Arrays;

import java.util.Arrays;

public class arrayTraversal{
    public static void main(String[] args){
    int[] array = {5, 2, 4, 1, 3};
    oliverAlgo(array);
        }

        //oliver algorithm reverses the arrays by using a temporary array

    public static void oliverAlgo(int[] array){
        int temp;
        for(int i = 1; i < array.length; i++){
            temp = array[i-1];
            array[i] = array[array.length-i];
        }
        System.out.print(Arrays.toString(array));
    }
}

