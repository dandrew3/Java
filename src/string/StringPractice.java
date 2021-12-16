package string;

import java.util.Locale;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        // We will ask user to their first name
        //We will ask user to their last name
        //We will print firstName in lowe case
        //last name in upper case.

        // .toLowerCase(); == makes the all letters lower case
        // .toUpperCase(); == makes the all letters upper case
        String str = "andrew";
        str.toUpperCase();
        // If we don't reassign the string it will not change its value
        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Enter your first name");
        String firstName = myScanner.nextLine();

        System.out.println("Enter your last name");
        String lastName = myScanner.nextLine();



        System.out.println(firstName.toLowerCase()+lastName.toUpperCase());
        System.out.println(firstName);

        //if I print like this will I changed values or non changed
        //If I apply method in print out paranthesis it will print the values with method applied.

    }
}
