package HomeWorkPractice;

import java.util.Scanner;

public class BlueOrRed {
    public static void main(String[] args) {

                System.out.println("Enter a string value");
                Scanner myScanner = new Scanner(System.in);
                String word = myScanner.nextLine();

        if (word.contains("r") && word.contains("e") && word.contains("d")) {
            System.out.println("red");
        }else if (word.contains("b") && word.contains("l") && word.contains("u") && word.contains("e")) {
            System.out.println("blue");
        }

    }
}
