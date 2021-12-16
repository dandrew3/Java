package HomeWorkPractice;

import java.util.Locale;
import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
       /* Using Scanner ask the user to enter one of the song names and
        make sure you are using nextLine() method to instantiate string.
        1. Print first char of given song name
        2. Print last char of given song name
        3. Print length of the given song name
        4. Print the index number of "k" in this song name
        5. Print char from an index number of 3
        6. Print song name upper case
                7. Print song name lower case

                Please do all printing in order.
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter song name");
        String songName = input.nextLine();
        int countLetter = songName.length();
        char firstChar = songName.charAt(0);
        char lastChar = songName.charAt(countLetter-1);
        int indexK = songName.indexOf("k");
        char index3 = songName.charAt(3);
        String songNameUpper = songName.toUpperCase();
        String songNameLower = songName.toLowerCase();

        System.out.println(firstChar);
        System.out.println(lastChar);
        System.out.println(countLetter);
        System.out.println(indexK);
        System.out.println(index3);
        System.out.println(songNameUpper);
        System.out.println(songNameLower);
    }
}
