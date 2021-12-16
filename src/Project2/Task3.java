package Project2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the amount");
        double sum = myScanner.nextDouble();

        double converte = sum * 100;

        double quqtRem = converte%25;
        double quarters =(converte-quqtRem)/25;
        int quartersInt = (int)quarters;

        double dimesRem = quqtRem%10;
        double dimes = (quqtRem-dimesRem)/10;
        int dimesInt = (int)dimes;

        double nicklesRemPennies = dimesRem%5;
        double nickles = (dimesRem-nicklesRemPennies)/5;
        int panniesInt = (int)nicklesRemPennies;
        int nicklesInt = (int)nickles;


        System.out.println(sum+" will make "+quartersInt+" quarters "+dimesInt+" dime "+nicklesInt+" nickels and "+panniesInt+" pennies");




    }
}
