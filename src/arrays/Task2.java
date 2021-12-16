package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
         /* -ask user, how many names that s/he wants to store in array
        -store those names by getting it from user in to array
        if the name has 5 or more letters store it in "longNames' array
        if hte name has less than 5 letters store it on 'shortNames' array
        -print them out by using ->Arrays.toString(); method*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many names do you want to store");
        int number = scanner.nextInt();
        String [] longName = new String[number];
        String [] shortName = new String[number];
        scanner = new Scanner(System.in);

        for (int i = 0; i<number; i++) {
            System.out.println("Enter"+(i+1)+".name");
            String name = scanner.nextLine();
            if (name.length() >=5) {
                longName[i] = name;
            }else {
                shortName[i] = name;
            }
        }
        System.out.println(Arrays.toString(longName));
        System.out.println(Arrays.toString(shortName));

    }
}
