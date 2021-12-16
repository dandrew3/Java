package loops.doWhile;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String str = myScanner.nextLine();
        int len = str.length();
int zero = 0;
        while (zero < str.length()) {
            char firstLetter = str.charAt(zero);
            System.out.print(firstLetter+", ");
            zero++;
        }


    }
}
