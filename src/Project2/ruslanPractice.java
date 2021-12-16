package Project2;

import java.util.Scanner;

public class ruslanPractice {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter three words: ");

        String word1 = myScanner.next();
        String word2 = myScanner.next();
        String word3 = myScanner.next();

        System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word3.charAt(0));
        System.out.println(word1.charAt(word1.length()-1)+""+word2.charAt(word2.length()-1)+""+word3.charAt(word3.length()-1));

        System.out.println(word1.length());
        System.out.println(word2.length());
        System.out.println(word3.length());




    }
}
