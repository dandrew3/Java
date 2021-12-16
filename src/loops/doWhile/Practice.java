package loops.doWhile;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the positive whole number ");
        int num = myScanner.nextInt();
        int divisor = 1;

        while (divisor<=num) {
            if (num%divisor==0) {
                System.out.println(divisor+" is divisor of"+num);
            }
            divisor++;
        }
    }
}
