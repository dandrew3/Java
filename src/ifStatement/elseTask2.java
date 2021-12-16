package ifStatement;

import java.sql.SQLOutput;
import java.util.Scanner;

public class elseTask2 {
    public static void main(String[] args) {
        //find out if your zipcode is even number or add number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your zipcode");
        int zip = scanner.nextInt();

        if (zip%2 == 0) {
            System.out.println("Your zipcode is even number ");
        }else {
            System.out.println("Your zipcode is odd number");
        }

    }
}
