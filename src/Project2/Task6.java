package Project2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) { // Starting point of the application
        Scanner myScanner = new Scanner(System.in); // Create a Scanner
        System.out.println("Enter three different ingredients for the product on the same line"); // Display question for the user
        String ing1 = myScanner.next(); // created 3 independent String words. But I didn't add Line();  at the end of the string.
        String ing2 = myScanner.next(); // It means user will type three words in the same line (as a one whole string) .
        String ing3 = myScanner.next(); //But I will get three separated words. It will be easier and shorter instead of separate one string for three words.

        System.out.println("Enter any int number"); //Display question for the user
        int num = myScanner.nextInt(); // Get a number from a user

        String ing1Result = (num++) + ing1.substring(1); // Increase value by one with post-increment operators
        String ing2Result = (num++) + ing2.substring(1); // we specify index till we want cutting string word (ingredient)
        String ing3Result = num + ing3.substring(1); // Add number to string without firs letter


        System.out.print("The output is: \n"+ing1Result+" "); // Show result in console
        System.out.print(ing2Result+" "); // \n - backslash + n move us to the next line
        System.out.print(ing3Result);
    }
}
