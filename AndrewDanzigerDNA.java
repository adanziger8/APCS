import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;

public class AndrewDanzigerDNA{
    public static void main(String[] args)throws FileNotFoundException{
        System.out.println("This program reports information about DNA");
        System.out.println("nucleotide sequences that may encode proteins");
//creates scanner to the console for user to state input and output file name
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

        //calls method to read file, parameters are print Stream and scanner (reading file)
        readFile(output, in);
    }

    public static void readFile(PrintStream output, Scanner in){
        String name = "";
        String nucs = "";

        while(in.hasNextLine()){
            //first line is name and sends to output file
            name = in.nextLine();
            output.println("Region Name: " + name);
            //next line is test answers which are sent to calculate method
            nucs = in.nextLine().toUpperCase();
            output.println("Nucleotides:" + nucs);
            String data = calculate(nucs);
            //prints test results to output file
            //output.println(data+"\n");
        }
    }

    public static String calculate(String nucs){
        int[] nucCount = new int[4];
        String[] allNucs = nucs.split("");
        //System.out.println(allNucs);
        for(int i = 0; i < allNucs.length; i++){
            if(allNucs[i].equals("A")){
                nucCount[0]++;
           }
            if(allNucs[i].equals("C")){
                nucCount[1]++;
            }
            if(allNucs[i].equals("G")){
                nucCount[2]++;
            }
            if(allNucs[i].equals("T")){
                nucCount[3]++;
            }
        }
        return "Nuc. Counts:" + nucCount;
    }
}
