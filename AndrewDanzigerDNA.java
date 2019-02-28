import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintStream;

public class AndrewDanzigerDNA{
    //four required class constants
    public static final int minCods = 5;    //min number of required codons
    public static final double minGCpercent = 30.0; //min percent of G and C nucleotides of total mass
    public static final int uniNucs = 4;    //number of unique nucleotides (A, T, G, C)
    public static final int nucPerCodon = 3;    //number of nucleotides per codon

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
        //creates scanner to read input file
        Scanner in = new Scanner(fileIn);
        //prompts user to type name of output file and creates it
        System.out.print("Output file name: ");
        String fileOutName = console.next();
        //creates new file and printstream to the file
        PrintStream output = new PrintStream(new File(fileOutName));
        //calls method to read file, parameters are print Stream and scanner (reading file)
        readFile(output, in);
    }
    //method that reads the input file
    public static void readFile(PrintStream output, Scanner in){
        String name = "";
        String nucs = "";
        while(in.hasNextLine()){
            //first line is name and sends to output file
            name = in.nextLine();
            output.println("Region Name: " + name);
            //next line is test answers which are sent to calculate method
            nucs = in.nextLine().toUpperCase();
            output.println("Nucleotides: " + nucs);
            String data = printData(nucs);
            //prints data to output file
            output.println(data+"\n");
        }
    }
    //method that returns all data to be printed
    public static String printData(String nucs){
        //arrays of int for count of unique nucleotides, String to separate each nucleotide, and double for masses of each nucleotide
        int[] nucCount = new int[uniNucs];
        String[] allNucs = nucs.split("");
        double[] nucMasses = new double[uniNucs];
        nucCount = countNucs(allNucs, nucCount);
        //calls method calcMass to retrieve the double value of total mass
        double totalmass = calcMass(allNucs);
        double amass = 0.0, cmass = 0.0, gmass = 0.0, tmass = 0.0, jmass = 0.0;
        //uses Array nucCount to calculate masses of each nucleotide
        amass = nucCount[0]*135.128;
        cmass = nucCount[1]*111.103;
        gmass = nucCount[2]*151.128;
        tmass = nucCount[3]*125.107;
        //uses individual masses to find percent of total mass
        nucMasses[0] = Math.round(amass/totalmass*1000.0)/10.0;
        nucMasses[1] = Math.round(cmass/totalmass*1000.0)/10.0;
        nucMasses[2] = Math.round(gmass/totalmass*1000.0)/10.0;
        nucMasses[3] = Math.round(tmass/totalmass*1000.0)/10.0;
    //array of Strings holding the list of codons
        String[] codonList = makeList(allNucs);
    //String of "YES" or "NO" whether the segment is a protein or not
        String protein = isProtein(codonList, cmass, gmass);
    //returns all data to the main method to be printed
        return "Nuc. Counts: " + Arrays.toString(nucCount) + "\nTotal Mass%: " + Arrays.toString(nucMasses) + " of " +
                Math.round(totalmass*10.0)/10.0 + "\nCodons List: " + Arrays.toString(codonList) + "\nIs Protein?: " +
                protein;
    }
    //method to count the number of unique nucleotides in a segment of DNA
    public static int[] countNucs(String[] allNucs, int[] nucCount){
        for(int i = 0; i < allNucs.length; i++){
            if(allNucs[i].equals("A")){
                nucCount[0]++;
            } else if(allNucs[i].equals("C")){
                nucCount[1]++;
            } else if(allNucs[i].equals("G")){
                nucCount[2]++;
            } else if(allNucs[i].equals("T")){
                nucCount[3]++;
            }
        }
        return nucCount;
    }
    //method to calculate the toal mass of a segment of DNA
    public static double calcMass(String[] allNucs){
        double[] nucMasses = new double[uniNucs];
        double totalmass = 0.0;
        for(int i = 0; i < allNucs.length; i++){
            if(allNucs[i].equals("A")){
                totalmass += 135.128;
            } else if(allNucs[i].equals("C")){
                totalmass += 111.103;
            } else if(allNucs[i].equals("G")){
                totalmass += 151.128;
            } else if(allNucs[i].equals("T")){
                totalmass += 125.107;
            } else {
                totalmass += 100.00;
            }
        }
        return totalmass;
    }
    //method to make a list of codons (array) ignoring the junk regions
    public static String[] makeList(String[] allNucs){
        String[] codonList = new String[1];
        String codon = "";
        //adds proper nucleotide to current codon String
        for(int i = 0; i < allNucs.length; i++){
            if(allNucs[i].equals("A")){
                codon += "A";
            } else if(allNucs[i].equals("C")){
                codon += "C";
            } else if(allNucs[i].equals("G")){
                codon += "G";
            } else if(allNucs[i].equals("T")){
                codon += "T";
            }
            if(codon.length()== nucPerCodon && i!= allNucs.length-1){
                codonList[codonList.length-1] = codon;
                codonList = newCodonList(codonList);
                codon = "";
            } else if(codon.length()== nucPerCodon && i== allNucs.length-1){
                codonList[codonList.length-1] = codon;
            }
        }
        return codonList;
    }
    //method to add one cell to array of Codons if needed
    public static String[] newCodonList(String[] codonList){
        String[] tempList = new String[codonList.length+1];
        for(int i = 0; i < codonList.length; i++){
            tempList[i] = codonList[i];
        }
        return tempList;
    }
    //method that checks all requirements for a sequence of DNA to be a protein
    public static String isProtein(String[] codonList, double cmass, double gmass){
        double cgmass = (cmass + gmass)*10.0;
        //checks if the percent of G and C is >= 30%, there are at least 5 codons, first codon is "ATG" (start)
        if(cgmass >= minGCpercent && codonList.length>= minCods && codonList[0].equals("ATG") &&
                //if last codon is "TAA" "TAG" or "TGA" (stop)
                (codonList[codonList.length-1].equals("TAA") || codonList[codonList.length-1].equals("TAG") ||
                        codonList[codonList.length-1].equals("TGA"))){
            return "YES";
        } else {
            //if not, then not a protein
            return "NO";
        }
    }
}