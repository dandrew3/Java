package string;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {
        //when we use nextLine () we can enter multiple words
        //
        // when use next it will not take more than one word

        Scanner myScanner = new Scanner(System.in);
        String str = myScanner.nextLine();
        //I can provide as many word as I want to.
        System.out.println("This value of first string " + str);

        String str1 = myScanner.next();
        System.out.println("This value of first string " + str1);
    }
}
