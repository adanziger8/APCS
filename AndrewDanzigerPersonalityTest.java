//This code asks user for a file to read and output to. It reads the names and test answers for different test takers
//and prints the test results and characteristic results from the personality test in the output file
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;

public class AndrewDanzigerPersonalityTest {
	public static void main(String[] args) throws FileNotFoundException{
		//creates scanner for user's input and prompts for name of input file
		Scanner console = new Scanner(System.in);
		System.out.print("Input file name: ");
		File fileIn = new File(console.next());
		//prompts user until correct input file name is typed
		while(!fileIn.exists()) {
			fileIn = new File(console.nextLine());
			if(!fileIn.exists()) {
				System.out.print("File not found. Try again: ");
			}
		}
		Scanner in = new Scanner(fileIn); 
		//prompts user to type name of output file and creates it
		String fileOutName = "";
		System.out.print("Output file name: ");
		fileOutName += console.next();
		//creates new file and printstream to the file
		PrintStream output = new PrintStream(new File(fileOutName));

		readFile(output, in);
	}
	//method to read the input file and tokenize information from it
	public static void readFile(PrintStream output, Scanner in) throws FileNotFoundException{
		String name = "";
		String letters = "";
		//while input file has another line
		while(in.hasNextLine()){
			//first line is name and sends to output file
			name = in.nextLine();
			output.println(name + ":");
			//next line is test answers which are sent to calculate method
			letters = in.nextLine();
			letters = calculate(letters);
			//prints test results to output file
			output.println(letters+"\n");
		}
	}
	//method to take tests answers and calculate the results and characteristics
	public static String calculate(String letters) {
		//creates array with length 70 of all lowercase answers
		String lowercase = letters.toLowerCase();
		String[] allletters = lowercase.split("");
		//creates two arrays to hold a and b values for the different types of questions
		int[] acount = new int[7];
		int[] bcount = new int[7];
		int count = 0;
		//goes through all answers in rounds of 7 and increases a or b value accordingly
		for(int i = 0; i<70; i++) {
			if(allletters[i].equals("a")) {
				acount[count]++;
			}
			if(allletters[i].equals("b")) {
				bcount[count]++;
			}
			count++;
			if(count == 7) {
				count -= 7;
			}
		}
		//integer variables of grouped questions for accessibility purposes
		int secondAs = (acount[1]+acount[2]);
		int secondBs = (bcount[1]+bcount[2]);
		int thirdAs = (acount[3]+acount[4]);
		int thirdBs = (bcount[3]+bcount[4]);
		int fourthAs = (acount[5]+acount[6]);
		int fourthBs = (bcount[5]+bcount[6]);
		//determines persons characteristic for first type of question
		String type = "";
		double first = (double)bcount[0]/(acount[0]+bcount[0])*100;
		int firstpercent = (int)first;
		if(firstpercent >50) {
			type += "I";
		} else if(firstpercent <50) {
			type += "E";
		} else {
			type += "X";
		}
		//determines persons characteristic for second type of question
		double second = (double)secondBs/(secondAs + secondBs)*100;
		int secondpercent = (int)second;
		if(secondpercent >50) {
			type += "N";
		} else if(secondpercent <50) {
			type += "S";
		} else {
			type += "X";
		}
		//determines persons characteristic for third type of question
		double third = (double)(thirdBs)/(thirdAs + thirdBs)*100;
		int thirdpercent = (int)third;
		if(thirdpercent >50) {
			type += "F";
		} else if(thirdpercent <50) {
			type += "T";
		} else {
			type += "X";
		}
		//determines persons characteristic for fourth type of question
		double fourth = (double)(fourthBs)/(fourthAs + fourthBs)*100;
		int fourthpercent = (int)fourth;
		if(fourthpercent >50) {
			type += "P";
		} else if(fourthpercent <50) {
			type += "J";
		} else {
			type += "X";
		}
		//returns A and B values of each type of question and then the percentage of B answers for each type
		//as well as the persons final characteristic type to be printed in the output file
		return acount[0] + "A-" + bcount[0] + "B " + secondAs + "A-" + secondBs + "B " + 
		thirdAs + "A-" + thirdBs + "B " + fourthAs + "A-" + fourthBs + "B \n[" + 
		firstpercent + "%, " + secondpercent + "%, " + thirdpercent + "%, " + fourthpercent + "%] = " + type;
	}
}