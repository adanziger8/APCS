//This program reads a file of numbers no greater then 25 digits
//and adds them together in each line printing the equation and the sum
package Ch7Arrays;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AndrewDanzigerSum {
    public static final int DIGIT = 25;
    public static void main(String[] args) throws FileNotFoundException {
        readFile();
    }

    public static void readFile() throws FileNotFoundException {
        int linecount = 0;
        Scanner in = new Scanner(new File("sum.txt"));
        //when file has another line
        while (in.hasNextLine()) {
            //make array of length 25 for sum
            int[] lineSum = new int[DIGIT];
            String line = in.nextLine();
            String eq = "";
            //makes each line a scanner
            Scanner tokenizer = new Scanner(line);
            linecount++;
            //while line has another number makes an array with length 25 and makes number a string
            while (tokenizer.hasNext()) {
                int[] num = new int[DIGIT];
                String numb = tokenizer.next();
                //if there is another number in line add plus sign between them
                if (tokenizer.hasNext()){
                    eq += numb + " + ";
                } else {
                    eq += numb;
                }
                //create a string array with the numbers split into each value
                String[] conv = numb.split("");
                //fills array for number with digits switched from string form to integer form
                for (int i = 0; i < conv.length; i++){
                    num[i] = Integer.parseInt(conv[i]);
                }
                //calls organize method and sets num array as rearranged array
                num = rearrange(num, conv.length);
                //calls addNums method to get updated lineSum array with completed addition of numbers
                lineSum = addNums(num, lineSum);
            }
            //makes the final value array into a string
            String finalValue = makeString(lineSum);
            //prints equation
            System.out.println(eq + " = " + finalValue);
        }
        //prints total lines
        System.out.println("");
        System.out.println("Total lines = " + linecount);
    }

    //this method takes the array holding a number and rearranges it by moving digits to back of array
    public static int[] rearrange(int[] num, int count) {
        for(int i = 0; i<DIGIT-count; i++) {
            //for loop moves digits to end of array one by one
            for(int j = DIGIT-2; j>=0; j--) {
                num[j+1] = num[j];
            }
            //fills all values of array with zeros if not occupied by number
            num[i] = 0;
        }
        return(num);
    }

    //this method adds all numbers in a line in one array(keeps updating each time array num has new number
    public static int[] addNums(int[] num, int[] lineSum) {
        for (int i = DIGIT-1; i>=0; i--) {
            //adds digit from array with numbers to array where math is being done
            lineSum[i] += num[i];
            //if numbers added are more than ten, the place before increases by one "carries the one"
            if (lineSum[i]>9) {
                lineSum[i] = lineSum[i]%10;
                //carry the one
                lineSum[i-1]++;
            }
        }
        return lineSum;
    }

    //this method takes array with final sum, turns it into a string and removes all zeros
    public static String makeString(int[] lineSum) {
        String sumStr = "";
        for (int i = 0; i<DIGIT; i++) {
            sumStr += lineSum[i];
        }
        int i = 0;
        while (sumStr.charAt(i) == '0' && i<24){
            i++;
        }
        //makes str a StringBuffer to remove zeros because strings can't be changed
        StringBuffer sb = new StringBuffer(sumStr);

        //StringBuffer replace function removes i characters from given index (0 here)
        sb.replace(0, i, "");
        return sb.toString();
    }
}