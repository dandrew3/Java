package ifStatement;

import java.util.Scanner;

public class ifPractice2 {
    public static void main(String[] args) {
        //assume that user is using military style time 1-24
        //print out good morning or good afternoon
        // for the hours of morning or afternoon
        //ask user to enter only hour fot hte time
        //if the hour is less than 12 print good morning
        //if hte hour is more than 12 less than 18 print good agternoon
        //if the hour is more than 18 print good evening
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter only hour as 1-24");
        int hour = (int)input.nextDouble();

        if (hour<12 && hour>=0){
            System.out.println("Good morning");
        }
        if (hour>=12 && hour<18){
            System.out.println("Good afternoon");
        }
        if (hour>=18 && hour <24) {
            System.out.println("Good evening");
        }
        if (hour<0 || hour>23){
            System.out.println("Check your time)");
        }

        /*int number = 1234;
        if (number){
            System.out.println("hello");
        }*/ //number is not condiition








    }
}
