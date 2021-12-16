package string;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        by using scanner ask user to provide his/her gender, full name and birth year in the following format
        F - Jenny Brown - 1999
                -check if the string starts with F
                -check if the string ends with M
                -check if the string contains your name
                -check if the string ending with birth year
        -replace '-' with '/'*/
        System.out.println("Please provide you gender, full name and birth year in the following format: F - Jenny Brown - 1999");
        String info = input.next();
        System.out.println(info.startsWith("M"));
        System.out.println(info.endsWith("0"));
        System.out.println(info.contains("Andrew"));
        System.out.println(info.endsWith("1990"));
        System.out.println(info.replace('-','/'));


    }
}
