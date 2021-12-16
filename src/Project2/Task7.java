package Project2;

import java.util.Locale;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter String (any two words) value with\n" +
                            "spaces in the beginning and at the end");
        String twoWords = myScanner.nextLine();
        int indexWord2 = twoWords.indexOf(" ",1)+1; // find out the index of first letter second word
        char letter = twoWords.charAt(indexWord2); // find out the first letter of second word

        String str = letter+" "; // add space for converting char to String
        String str1 = str.toUpperCase(Locale.ROOT); // convert String to upper case
        char letterUpperCase = str1.charAt(0); // take converted letter in upper case

        String result = twoWords.replace(letter,letterUpperCase); // replace letter to upper case letter

        System.out.println(result);

    }
}
