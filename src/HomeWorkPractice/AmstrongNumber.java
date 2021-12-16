package HomeWorkPractice;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of term");
        int num = scan.nextInt();
        int sum = 0;
        int result = 0;
        for ( ;num > 0; num--) {
            sum = 1+(sum*10);
            result += sum;
        }
        System.out.println(result);
    }
}
