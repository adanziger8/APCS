package src.Ch10ArrayLists;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Vocabulary2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileread1 = new Scanner(new File("hamlet.txt"));
        Scanner fileread2 = new Scanner(new File("lear.txt"));

        //populate arrayList
        ArrayList<String> list1 = getWords(fileread1);
        ArrayList<String> list2 = getWords(fileread2);

        ArrayList<String> commonWords = overlap(list1, list2);
        System.out.println(commonWords);

    }

    //This method accepts a Scanner object and populates an
    //ArrayList after case-folding. The ArrayList is then
    //sorted before removing any duplication. This method returns
    //an ArrayList of Strings that contains unique words
    public static ArrayList<String> getWords(Scanner input) {
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
