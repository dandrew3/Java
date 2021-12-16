package switchStatement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
       /* Ask user for his/her favorite fruit
        -you have: mango, banana, kiwi, orange, apple, grape
        if you have user's favorite fruit, --> We have your favorite fruit in our store
        -orher wise: Sorry, we don't have your favorite fruit :( :*/

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter you favorite fruit");
        System.out.println("mango, banana, kiwi,orange,apple,grape");
        String fruit = myScanner.nextLine();

        switch (fruit.toLowerCase()) {
            case "mango":
                System.out.println("We have your favorite fruit in the store");
            break;
            case "banana":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "kiwi":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "orange":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "apple":
                System.out.println("We have your favorite fruit in the store");
                break;
            case "grape":
                System.out.println("We have your favorite fruit in the store");
                break;
            default:
                System.out.println("We don't have favorite in the store");
                break;

        }



    }
}
