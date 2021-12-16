package HomeWorkPractice;

import java.util.Scanner;

public class ReplaceWithA {
        public static void main(String[] args) {
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter a string value");
            String str = myScanner.nextLine();
            int index = 1;
            String a = "a";
            while (index <= str.length()) {
                str = str.substring(index);
                str = a+str;
                index++;
                a +="a";
                System.out.println(str);
            }

        }
    }

