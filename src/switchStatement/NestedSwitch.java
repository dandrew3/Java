package switchStatement;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        // 1 - IT dept
        //    David, Tima
        // 2 - Admin
        //    Alex , Jessi
        // 3 - Customer Care
        //     Zack, Ana, John
        System.out.println("Please enter the department: \n1 - IT dept\n2 - Admin\n3 - Customer Care ");
        Scanner input = new Scanner(System.in);
        int dep = input.nextInt();

        switch (dep) {
            case 1:
                System.out.println("You in IT department. Who do yu want to speak with David or Tima? Please enter:");
                input = new Scanner(System.in);
                String name = input.nextLine().toLowerCase(Locale.ROOT);
                switch (name) {
                    case "tima":
                        //int hour = LocalDateTime.now().getHour();
                        int hour = 20;
                        if (hour>8 && hour<16) {
                            System.out.println("Hi, this is Tima. How can I help you?");
                        }else if (hour<8 && hour>16) {
                            System.out.println("Hi, this is Tima. How can I help you?");
                        }else {
                            System.out.println("I don't working in this time");
                        }
                        break;
                    case ("david"):
                        System.out.println("Hi, this is David. How can I help you?");
                        break;
                    default:
                        System.out.println("We dont have person with name"+name);
                        break;
                }
                break;
            case 2:
                System.out.println("You in ADMIN department. Who do yu want to speak with Alex or Jessi? Please enter:");
                input = new Scanner(System.in);
                String name1 = input.nextLine().toLowerCase(Locale.ROOT);
                switch (name1) {
                    case "alex":
                        System.out.println("Hi, this is Alex. How can I help you?");
                        break;
                    case "jessi":
                        System.out.println("Hi, this is Jessi. How can I help you?");
                        break;
                    default:
                        System.out.println("We don't have a person with name "+ name1);
                        break;
                }
                break;
            case 3:
                System.out.println("You in ADMIN department. Who do yu want to speak witt Zack, Anna or John? Please enter:");
                input = new Scanner(System.in);
                String name3 = input.nextLine().toLowerCase(Locale.ROOT);
                switch (name3) {
                    case "zack":
                        System.out.println("Hi, this is Zack. How can I help you?");
                        break;
                    case "anna":
                        System.out.println("Hi, this is Anna. How can I help you?");
                        break;
                    case "john":
                        System.out.println("Hi, this is John. How can I help you?");
                        break;
                    default:
                        System.out.println("We don't have a person with name "+name3);
                }
                break;
        }




    }
}
