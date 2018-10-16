package Ch7Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class AndrewDanzigerRandomHatV2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);//import scanner
        System.out.print("How many teams are there? ");//prompts user for number of teams
        int n = console.nextInt();
        while(n%2 != 0) {//keeps prompting user until number of teams is an even number
            System.out.print("How many teams are there? ");
            n = console.nextInt();
        }
        setTeams(n);//passes number of teams to method to array items with team values
    }

    public static void setTeams(int n) {//This method sets each item in the array with a value 1 greater than its index
        int[] teams = new int[n];//Therefore when later checking for repeats (value of zero) they will all be different
        for(int i = 0; i<teams.length; i++) {
            teams[i] = i+1;
        }
        match(teams, n);//passes number of teams and array of teams to start matching teams up
    }

    public static void match(int[] teams, int n) {//This method picks teams without replacement and matches them up
        int vs = 0;//initialize variable to determine first or second team of match up
        for(int i = 0; i<teams.length; i++) {
            int a = (int) (Math.random()*n);
            while(teams[a] == 0) {//keeps choosing random team until team chosen has not already been picked
                a = (int) (Math.random()*n);
            }
            System.out.print("Team " + teams[a]);//prints first team
            teams[a] = 0;//changes its value so it is not chosen again
            if(vs == 0) {//if first team picked, then add "vs" after it
                System.out.print(" vs ");
                vs++;
            } else {//if second team picked, don't add "vs" and reset variable
                vs = 0;
                System.out.println();
            }
        }
    }
}
