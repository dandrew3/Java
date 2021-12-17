package MentoringWithArtem.InterviewQuestionWithDebugging;

import java.util.Scanner;

public class FindTheMultiplicationOfNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for multiplications");
        int num = scan.nextInt();
        int multipResult = 1;

        for ( ; num != 0; ) {
            multipResult *= num%10;
            num /=10;
        }
        System.out.println(multipResult);
    }
}
