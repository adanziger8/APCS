package Ch10ArrayLists;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExcercise {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner fileread = new Scanner(new File("data.txt"));
        ArrayList<String> words = new ArrayList<String>();
        while(fileread.hasNextLine()){
            words.add(fileread.nextLine());
        }
        System.out.println(words);

        ArrayList<String> reversed = new ArrayList<String>();
        for(int i = 0; i<words.size(); i++){
            reversed.add(words.get(words.size()-i-1));
        }
        System.out.println(reversed);

        ArrayList<String> plural = new ArrayList<String>();
        for(int i = 0; i < words.size(); i++){
            String word = words.get(i);
            if(words.get(i).charAt(words.get(i).length()-1) == 's'){
                words.set(i, word.substring(0, word.length()-1) + (word.substring(word.length()-1)).toUpperCase());
            }
        }
        System.out.println(words);

        for(int i = 0; i < words.size(); i++){
            String word = words.get(i);
            if(words.get(i).charAt(words.get(i).length()-1) == 'S'){
                words.set(i, word.substring(0, word.length()-1));
            }
        }
        System.out.println(words);
    }
}
