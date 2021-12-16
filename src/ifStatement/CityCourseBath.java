package ifStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CityCourseBath {
    public static void main(String[] args) {
        System.out.println("Which City do you live?");
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();

        if (city.equalsIgnoreCase("chicago"))   {
            System.out.println("Which course fo you have? ");
            String course = scanner.nextLine();
            if (course.equalsIgnoreCase("techtorial")) {
                System.out.println("Which bath are you in ");
                String bath = scanner.nextLine();
                if (bath.equalsIgnoreCase("11")) {
                    System.out.println("It is getting easier!!!");
                } else {
                    System.out.println("Congrats, you already done");
                }
            }else {
                System.out.println("We are in Des Planes, please visit us");
            }
        }else {
            System.out.println("You don't live in Chicago");
        }


    }
}
