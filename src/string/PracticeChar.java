package string;

import java.util.Scanner;

public class PracticeChar {
    public static void main(String[] args) {
        // How to take char from String
        // .charAt();
        String devise = "microphone";
        char ch = devise.charAt(0);
        char ch2 = devise.charAt(4);
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println(devise.charAt(9));

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word: ");
        String word = input.next();
        System.out.println("This is your first letter in the string : "+word.charAt(0));
        //without storing incoming string value, taking a letter from it and print it
        System.out.println("Please enter another word: ");
        System.out.println("This is first letter in second word: "+input.next().charAt(0));

    }
}
