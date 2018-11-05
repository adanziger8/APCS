package Ch7Arrays;

import java.util.Scanner;

public class AndrewDanzigerSum {
    public static final int DIGIT = 25;
    public static void main(String[] args) {
        Scanner file = new Scanner("sum.txt");
        while(file.hasNextLine()){
            String longest = "";
            String line = file.nextLine();
            Scanner console = new Scanner(line);
            String number = "" + file.nextInt();
        while(console.hasNext()){
            String current = console.next();
            int[] num = new int[DIGIT];
            String[] expand = current.split("");
            for(int i = 0; i <expand.length; i++){
                num[DIGIT-i-1] = Integer.parseInt(expand[expand.length-i-1]);
            }
            }
        }
    }
}
