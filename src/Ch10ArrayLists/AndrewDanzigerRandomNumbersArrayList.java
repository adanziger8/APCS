//this is a program that reads random numbers from a file and prints desired information from it
package Ch10ArrayLists;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.*;


public class AndrewDanzigerRandomNumbersArrayList {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner fileread = new Scanner(new File("randomNumbers.txt"));
        ArrayList<String> numbers = new ArrayList<String>();
        //runs through file, making Array List of all numbers and prints array list
        while(fileread.hasNextLine()) {
            String linenumber = "";
            linenumber = fileread.nextLine();
            numbers.add(linenumber);
        }
        System.out.println(numbers);

        //for loop that runs through array list, making every string an int, adding to sum variable
        double avg = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.size(); i++) {
            avg += Integer.parseInt(numbers.get(i));
            //checks for minimum value
            if(Integer.parseInt(numbers.get(i)) > max){
                max = Integer.parseInt(numbers.get(i));
            }
            //checks for maximum value
            if(Integer.parseInt(numbers.get(i)) < min){
                min = Integer.parseInt(numbers.get(i));
            }
        }
        //prints average, min, and max all in separate lines
        System.out.println("Average: " + (avg/numbers.size()));
        System.out.println("min:" + min);
        System.out.println("max:" + max);

        //checks if number is even, if so removes it from the array list
        for(int i = numbers.size()-1; i > 0 ; i--) {
            if(Integer.parseInt(numbers.get(i))%2 == 0){
                numbers.remove((numbers.get(i)));
            }
        }
        //prints array list without even numbers
        System.out.println(numbers);
    }
}