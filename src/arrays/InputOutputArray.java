package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many cars do you have?");
        int num = scan.nextInt();       // create integer from user
        String[] garage = new String[num]; // create string array and in square brackets specified number which we took from a user

        scan = new Scanner(System.in);      // reinitialize scanner
        for (int a = 0;a<num; a++) {  //specified elements (cars) for each index
            System.out.println("Which cars you have");
            garage[a] = scan.nextLine();
        }

        for (int i = 0;i<num; i++ ) {    // for loop lets print elements one by one
            System.out.println(garage[i]);
        }

        System.out.println(Arrays.toString(garage)); // print in one line all elements of array
    }
}
