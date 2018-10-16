package Ch7Arrays;
import java.util.Scanner;

public class mostFrequesnt {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int n = console.nextInt();
        while (n <0){
            System.out.print("Please enter a positive number: ");
            n = console.nextInt();
        }
        int maxplace = liamPriceAlgo(n);
        System.out.println("The most frequent occuring digit is " + maxplace);
    }

    public static int liamPriceAlgo(int n){
        int[] tally = new int[10];
        while (n > 0){
            tally[n%10] ++;
            n/=10;
        }
        int maxval = -1;
        int maxplace = -1;
        for(int i = 0; i<tally.length; i++){
            if(tally[i] > maxval){
                maxval = tally[i];
                maxplace = i;
            }
            if(tally[i] == maxval){
                maxplace = Math.min(i, maxplace);
            }
        }
        return maxplace;
    }
}