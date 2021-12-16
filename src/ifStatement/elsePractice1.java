package ifStatement;

import java.util.Scanner;

public class elsePractice1 {
    public static void main(String[] args) {
        // get three test results from user and calculate the average of those three tests
        //based on the overage score:
        // -print out letter grade for this student
        //average --> 100 - 90 your letter grade is A
        //overage is  --> 89 - 80 --> your letter grade is B
        //            --> 79 - 60 --> ...................C
        //            --> less than 60 --> your should take the course again
        Scanner myScanner = new Scanner(System.in);
        System.out.println("please enter your first score");
        int test1 = myScanner.nextInt();
        System.out.println("please enter your second score");
        int test2 = myScanner.nextInt();
        System.out.println("please enter your three score");
        int test3 = myScanner.nextInt();

        int range = (test1 + test2 + test3) / 3;

        if (range <= 100 && range >= 90) {
            System.out.println("your range is A");
        } else if (range <= 89 && range >= 80) {
            System.out.println("your range is B");
        } else if (range <= 79 && range >= 60) {
            System.out.println("your range is C" );
        } else  {
            System.out.println("You should take a course again");
        }
    }
}