package string;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        //use scanner to
        //get name and DOB year of user
        //calculate user's age
        //print "You age <age> years old"

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your Name:");
        String name = myScanner.nextLine();

        System.out.println("Please enter your DOB: (28.02.1990):");
        int DOB = myScanner.nextInt();

       int age = 2021 - DOB;
        System.out.println(age);

        int currentYear = LocalDateTime.now().getYear();
        int currentMinutes = LocalDateTime.now().getMinute();
        System.out.println(currentYear + " and " + currentMinutes);
    }
}
