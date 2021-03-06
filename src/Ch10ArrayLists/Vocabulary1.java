package src.Ch10ArrayLists;

        import java.io.File;
        import java.io.FileNotFoundException;
        import java.text.DecimalFormat;
        import java.util.ArrayList;
        import java.util.Collections;
        import java.util.Scanner;



public class Vocabulary1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileread1 = new Scanner(new File("text1.txt"));
        Scanner fileread2 = new Scanner(new File("text2.txt"));

        //populate arrayList
        ArrayList<String> list1 = getWords(fileread1);
        ArrayList<String> list2 = getWords(fileread2);

        System.out.println(list1);
        System.out.println(list2);
        ArrayList<String> commonWords = overlap(list1, list2);
        System.out.println(commonWords);

        DecimalFormat df = new DecimalFormat("###.##");
        System.out.println("Percent Overlap File 1: " + df.format(percCalc(commonWords, list1)));
        System.out.println("Percent Overlap File 2: " + df.format(percCalc(commonWords, list2)));

    }

    public static double percCalc(ArrayList<String> common, ArrayList<String> list){
        return (double)common.size()*100/list.size();
    }

    //This method accepts a Scanner object and populates an
    //ArrayList after case-folding. The ArrayList is then
    //sorted before removing any duplication. This method returns
    //an ArrayList of Strings that contains unique words
    public static ArrayList<String> getWords(Scanner input) {
        input.useDelimiter("[^a-zA-Z']+");

        //read all words into an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        while (input.hasNext()) {
            words.add(input.next().toLowerCase());
        }
        //sort words
        Collections.sort(words);

        //add unique words to a list and return it
        ArrayList<String> uniqueWords = new ArrayList<String>();
        if (words.size() > 0) {
            uniqueWords.add(words.get(0));
            for (int i = 1; i < words.size(); i++) {
                if (!words.get(i).equals(words.get(i - 1))) {
                    uniqueWords.add(words.get(i));
                }
            }
        }

        return uniqueWords;
    }

    public static ArrayList<String> overlap(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> words = new ArrayList<String>();
        int i1 = 0;
        int i2 = 0;
        while (i1 < list1.size() && i2 < list2.size()) {
            if ((list1.get(i1).compareTo(list2.get(i2))) == 0) {
                words.add(list1.get(i1));
                i1++;
                i2++;
            } else if ((list1.get(i1).compareTo(list2.get(i2))) < 0) {
                i1++;
            } else {
                i2++;
            }
        }
        return words;
    }
}
