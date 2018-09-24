//This is a program that takes a users number of days and temperatures and calculates the average temp and
//how many days are above the average temperature
import java.util.Scanner;

public class AndrewDanzigerWeatherAnalysis {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);//initializes scanner
        System.out.print("How many days' temperatures? ");//prompts user for number of days
        int days = input.nextInt();//stores users number as an int
        double totaltemp = 0.0;//initializes total temp, later to be used to calculate average
        info(input, totaltemp, days);//pass proper values to first method
    }

    public static void info(Scanner input, double totaltemp, int days) {
        int[] dayz = new int[days];//initialize array to hold temperatures



        for (int i = 1; i <= days; i++) {//for loop for number of days
            System.out.print("Day " + i + "'s high temp: ");//prompts user for new temp
            int temp = input.nextInt();//stores users input as an int
            totaltemp += temp;//updates total temperature by adding all temps
            dayz[i - 1] = temp;//updates array
        }
        calculate(totaltemp, dayz, days);
    }

        public static void calculate(double totaltemp, int[] dayz, int days){
            double avg = totaltemp / days;//calculate average
            System.out.println("Average temp = " + Math.round(avg * 10) / 10.0);//rounds average to only one decimal
            int aboveavg = 0;//initilaize days above average

            for (int j = 0; j <= dayz.length - 1; j++) {
                if (dayz[j] > avg) {//for loop checking if each value in array is above average temp or not
                    aboveavg++;//if temp is above average, adds one to this variable
                }
            }
            System.out.println(aboveavg + " days were above average.");//prints how many days are above average
        }
}
