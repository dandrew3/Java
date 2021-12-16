package loops.doWhile;

import javax.swing.text.SimpleAttributeSet;
import java.util.Scanner;

public class MakingStarTree {
    public static void main(String[] args) {
       /* -Ask user to provide a number between 3 to 10
                - make a star tree for that many line
                (Use Do-While Loop to implement solution)
        ex: input --> 4
                  *
                  **
                  ***
                  ****
                Collapse
                See video clips in action
                Send a message to classnotes
*/
        System.out.println("Please enter the numbr from 3 to 7");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        int x = 0;
        String str = "*";

        do {
            System.out.println(str);
            str +="*";
            x++;
        }while(x<number);









    }
}
