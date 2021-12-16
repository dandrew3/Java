package loops.doWhile;

import java.util.Scanner;

public class MultiplicationTableTask {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter the whole integer number ");
        int num = myScanner.nextInt();
int a = 1;
        while (a<=10) {
            System.out.println(num+"*"+a+"="+(num*a));
            a++;
        }



    }
}
