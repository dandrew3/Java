package MentoringWithArtem.InterviewQuestionWithDebugging;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseTheWordsAndNumbers {

    // Ask the user to input a word and reverse it
    // Ask the user to input a number and reverse it
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scan.nextLine();
        String revWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            revWord += word.charAt(i);
        }
        System.out.println(revWord);


        System.out.println("Please enter the number");
        int num = scan.nextInt();
        int revNum = 0;

        for ( ;num != 0;  ) {
            revNum = revNum*10+num%10;
            num/=10;
        }
        System.out.println(revNum);
    }
}
