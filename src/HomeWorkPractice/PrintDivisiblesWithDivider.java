package HomeWorkPractice;

import java.util.Scanner;

public class PrintDivisiblesWithDivider {
    public static void main(String[] args) {



            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a starting number");
            int num1 = scan.nextInt();
            System.out.println("Enter an ending number");
            int num2 = scan.nextInt();
            int count = 0;

            for (      ; num1 <= num2 ; num1++ ){
                if (num1%3==0 && num1%5==0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }


