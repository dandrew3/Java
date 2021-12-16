package Project2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Write 5 digit number: ");
        int number = myScanner.nextInt();

        if (number>=10000 && number<=99999) {

            int d5 = number%10;
            number = number/10;

            int d4 = number%10;
            number = number/10;

            int d3 = number%10;
            number = number/10;

            int d2 = number%10;
            number = number/10;

            int d1 = number%10;


            System.out.print("The output is "+d5);
            System.out.print(d4);
            System.out.print(d3);
            System.out.print(d2);
            System.out.print(d1);

        }else {
            System.out.println("Number "+number+" is not acceptable");
        }

    }
}

