package Project2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter only 6 digits number: ");
        int number = myScanner.nextInt();

if (number>=100000 && number<=999999) {
    int d6 = number%10;
    number = number/10;

    int d5 = number%10;
    number = number/10;

    int d4 = number%10;
    number = number/10;

    int d3 = number%10;
    number = number/10;

    int d2 = number%10;
    number = number/10;

    int d1 = number%10;

    System.out.println("Multiplication of all digits is: "+d1*d2*d3*d4*d5*d6);
    System.out.println("The sum of all digits: "+d1+d2+d3+d4+d5+d6);
}else {
    System.out.println("Number "+number+" is not accepteble");
}

    }
}
