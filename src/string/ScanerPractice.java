package string;

import java.util.Scanner;

public class ScanerPractice {
    public static void main(String[] args) {
        String name = "David";
        System.out.println("My name is " +name);
        System.out.println("Please enter your last name");

        //creating Scaner object
        Scanner imput = new Scanner(System.in);


        String lastName = imput.nextLine();
        System.out.println(lastName);
        System.out.println(lastName);




        System.out.println("Please enter your city name");
        String city = imput.nextLine();
        System.out.println(name + " " + lastName + " you are liveng in " +city);

        lastName = "xxxxxxx";
        System.out.println(lastName);


        System.out.println("Please enter your age ");
        int age = imput.nextInt();
        System.out.println(name + " your age is ver good age. That is " +age);

        System.out.println("Please give me your hight in inches (5.8)");
        double height = imput.nextDouble();
        System.out.println("your height is " + height);

        System.out.println("Please enter your address" );
        imput = new Scanner(System.in);
        String address = imput.nextLine();
        System.out.println("Is this correct address you pavided" + address);

    }
}
