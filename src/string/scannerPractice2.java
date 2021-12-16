package string;

import java.util.Scanner;

public class scannerPractice2 {
    public static void main(String[] args) {
        //BMI calculation = weight(kg)/(height*height(meter))
        // 18 - 24
        // "your BMI is <BMI>"

        Scanner imput1 = new Scanner(System.in);


        System.out.println("Enter your waight in kilograms: ");
        double waight = imput1.nextDouble();

        System.out.println("Plese enter your height in meters(1.8): ");
        double height = imput1.nextDouble();

        double BMI = waight/(height*height);
        System.out.println("YOU are good,your BMI IS:" +BMI);

    }
}
