package Project2;


import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
       Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter count of Quarters: ");
        double quarters = myScanner.nextDouble();

        System.out.println("Please enter count of dimes: ");
        double dimes = myScanner.nextInt();

        System.out.println("Please enter count of nickels: ");
        double nickels = myScanner.nextInt();

        System.out.println("Please enter count of pennies: ");
        double pennies = myScanner.nextInt();

        double quartersTotal = quarters*0.25;
        double dimesTotal = dimes*0.10;
        double nickelsTotal = nickels*0.05;
        double penniesTotal = pennies*0.01;

        double result = quartersTotal+dimesTotal+nickelsTotal+penniesTotal;
        double result1 = Math.round(result * 100.0) / 100.0;
        System.out.println("Yor total is: " +result1+"$");

        }
    }

