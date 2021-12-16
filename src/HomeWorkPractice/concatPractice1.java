package HomeWorkPractice;

import java.util.Scanner;

public class concatPractice1 {
    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    System.out.println("Enter string 1");
    String str = myScanner.nextLine();
    System.out.println("Enter string 2");
    String str1 = myScanner.nextLine();
    int len = str.length();
    int len1 = str1.length();

if (len == len1) {
        System.out.println(str.concat(str1));
    }else if (len > len1) {
        System.out.println(str.substring(0, len1).concat(str1));
    }else if (str.length()<str1.length()) {
        System.out.println(str.concat(str1.substring(0, len)));
    }


}
}