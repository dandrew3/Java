package string;

import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        //Ask user to enter an integer number
        //We will find out if this is an even
        //Out
        Scanner mySkanner = new Scanner(System.in);
        System.out.println("Enter the integer number");
        int num = mySkanner.nextInt();
        //If remainder with 2 gives 0 this number will be even
        //other wise it is add
        boolean isEven = num % 2 == 0;
        System.out.println(num + " is even number its " + isEven);
    }
}