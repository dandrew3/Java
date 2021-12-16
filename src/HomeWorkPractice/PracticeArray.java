package HomeWorkPractice;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many people you want to invite: ");
        int number = scan.nextInt();
        String[] names = new String[number];
        System.out.println("Enter how many people you want to invite: ");

scan = new Scanner(System.in);
        for (int i = 0; number>i; i++ ) {
            System.out.println("Enter "+(i+1)+" name");
            names[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(names));
    }
}
