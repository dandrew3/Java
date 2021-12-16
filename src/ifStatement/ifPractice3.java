package ifStatement;

import java.util.Locale;
import java.util.Scanner;

public class ifPractice3 {
    public static void main(String[] args) {
        //ask use to enter a single word
        //if the word's first letter is:
        //M --> there is a day starts with M >> Monday
        //T -->                            T >> Tuesday/Thursday
        // W -->                            W >> Wensday
        // F -->                            F >> Friday
        // S -->                            S >> Saturday

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a single word: ");
        String word = myScanner.nextLine().toUpperCase();

        int firstLetter = word.indexOf(0);

        if (word.startsWith("M")) {
            System.out.println("Monday");
        }
        if (word.startsWith("T")) {
            System.out.println("Tuesday/Thursday");
        }

        if (word.startsWith("W")) {
            System.out.println("Wednesday");
        }
        if (word.startsWith("F")) {
            System.out.println("Friday");
        }
        if (word.charAt(0) == 'S') {
            System.out.println("Saturday/Sanday");
        }
        if (!word.startsWith("M") && !word.startsWith("T") && !word.startsWith("W") && !word.startsWith("F") && !word.startsWith("S")) {
            System.out.println("There is no day");
        }




    }
}
