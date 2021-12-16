package HomeWorkPractice;

import java.util.Scanner;

public class SpeadWhile {

        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter current speed");
            int curSpead = myScanner.nextInt();
            System.out.println("Enter target speed");
            int tarSpead = myScanner.nextInt();
            int count = 0;
            while (curSpead < tarSpead) {
                count++;
                curSpead +=10;
            }
            System.out.println(count);
        }
    }

