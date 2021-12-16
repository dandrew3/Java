package switchStatement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        /*
        get a number between 1 to 4 user
        print out name of a season as:
        1 - Winter
        2 - Spring
        3 - Summer
        4 - Autom
         */
        System.out.println("Write th number from 1 -4");
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        switch (num) {
            case 1:
                System.out.println("It is Winter");
                break;
            case 2:
                System.out.println("It is Spring");
                break;
            case 3:
                System.out.println("It is Summer");
                break;
            case 4:
                System.out.println("It is Fall");
                break;
            default:
                System.out.println("Wrong number");
                break;
    }
}
}
