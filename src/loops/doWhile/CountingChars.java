package loops.doWhile;

import java.util.Locale;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
        /*
        - count letters, digits and other characters in the String
          String str = "$3%GTlk64mn^y?";
            sout("There are <..> letters in the string");
            sout("There are <..> digits in the string");
            sout("There are <..> special chars in the string");
        */
         Scanner myScanner = new Scanner(System.in);
        // String str = myScanner.nextLine();
        String str = "$3%GTlk64mn^y?".toUpperCase(Locale.ROOT);
        int index = 0;
        int countLetter = 0, countDigits = 0, countChars = 0;

        do {
            if (str.charAt(index) >= 'A' && str.charAt(index) <= 'Z') {
                countLetter++;
            }else if (str.charAt(index)  >= '0' && str.charAt(index) <= '9') {
                countDigits++;
            }else {
                countChars++;
            }
            index++;
        }while (index<str.length());
        System.out.println("There are "+countLetter+" letters in the string");
        System.out.println("There are "+countDigits+" digits in the string");
        System.out.println("There are "+countChars+" special chars in the string");

    }
}

