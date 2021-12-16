package ifStatement;

import java.util.Scanner;

public class NestedIfPractice {
    public static void main(String[] args) {
        //passport
        //visa
        //ticket
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you hava passport? yes/no ");
        String passport = scanner.nextLine();


        if (passport.equalsIgnoreCase("yes")){
            System.out.println("Do you hava visa yes/no");
            if (scanner.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("Do you hava ticket?");
                if (scanner.nextLine().equalsIgnoreCase("yes")) {
                    System.out.println("enjoy need to get visa");
                }else {
                    System.out.println("please get your ticket");
                }

            }else {
                System.out.println("You need the visa");
            }





        }else {
            System.out.println("Please ge the passport first");
        }
    }
}
