package Ch10ArrayLists;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExcercise {

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        list.add("the");
        list.add("quick");
        list.add("brown");
        list.add("fox");
        addStars(list);
        Integer[] num1 = {1,4,8,11,15,17,28,41,59};
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(num1));

        Integer[] num2 = {4,7,11,17,19,20,23,28,37,59,81};
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(num2));
        intersect(nums1, nums2);

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

    public static void addStars(ArrayList<String> words){
        int size = words.size();
        for(int i = 1; i < size*2; i+=2){
            words.add( i,"*");
        }
        System.out.println(words);
    }

    public static void intersect(ArrayList<Integer> num1, ArrayList<Integer> num2){
        ArrayList<Integer> intersect = new ArrayList<>();
        for(int i = 0; i < num1.size(); i++){
            if(num2.contains(num1.get(i))){
                intersect.add(num1.get(i));
            }
        }
        System.out.println(intersect);
    }
}
