package ifStatement;

import java.util.Scanner;

public class ifPractice1 {
    public static void main(String[] args) {
        //get a number betwen 1 to 7 from user
        //print the name of the day for that given number from user

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1 -7");
        double number = input.nextDouble();
        int numb = (int)number;

        if (numb == 1){
            System.out.println("monday");
        }
        if (numb == 2){
            System.out.println("thusday");
        }
        if (numb == 3){
            System.out.println("wendnsdey");
        }
        if (numb == 4){
            System.out.println("thrusday");
        }
        if (numb == 5){
            System.out.println("friday");
        }
        if (numb == 6){
            System.out.println("saturday");
        }
        if (numb == 7){
            System.out.println("sunday");
        }
        if (numb>7 || numb<1){
            System.out.println("wrong number");
        }
        // if the user enters out of range number
        // print your number is out of range
    }
}
