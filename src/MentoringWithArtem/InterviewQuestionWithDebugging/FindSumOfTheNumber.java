package MentoringWithArtem.InterviewQuestionWithDebugging;

import java.util.Scanner;

public class FindSumOfTheNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the number");
        int num = scan.nextInt();
        int sum = 0;

        for ( ; num != 0; ) {
            sum += num%10;
            num/=10;
        }
        System.out.println(sum);
    }
}
