package string;

import java.util.Scanner;

public class ScannerPractice6 {
    public static void main(String[] args) {

                    /* -deposit money for David
                create a new class: MoneyTransaction
                David wants to deposit his paychecks into his account and already has $200
                He has 3 paychecks (610, 385, 975)
                he can only deposit one check at a time
                *Ask: "How much is Deposit amount?" every time he is making deposit
                after all of paycheks deposited in to account
                he bought a phone for $599 and headphone for $299
                *Ask: How much is phone?
                        *Ask: How much is headPhone?
                Calculate his final money and print --> "Your final balance is <finalAmount>"
            */
        Scanner input = new Scanner(System.in);
        double balance = 200;
        System.out.println("How much your deposit amount is? ");
        double firsDep = input.nextDouble();
        balance +=firsDep;

        System.out.println("How much your depasit amount is? ");
        double secDep = input.nextDouble();
        balance +=secDep;

        System.out.println("How much your deposit amountis? ");
        double thirdDep = input.nextDouble();
        balance +=thirdDep;


        System.out.println("How much your phone payment?");
        double phonePayment = input.nextDouble();
        balance -=phonePayment;

        System.out.println("How much your handPhone payment?");
        double handPhonePayment = input.nextDouble();
        balance -=handPhonePayment;

        System.out.println("Your final balance is: $"+balance);









    }
}
