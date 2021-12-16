package loops.forLoop;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i < 6; i++ ) {
           for (int k = 1; k <11; k++) {
               System.out.println(i+" * "+k+" = "+i*k);
           }
        }
    }
}
