package string;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
        //Ask user to enter an integer number
        //We will find out if this is an even
        //Out
        Scanner mySkanner = new Scanner(System.in);
        System.out.println("Enter the integer number");
        int num = mySkanner.nextInt();
        //If remainder with 2 gives 0 this number will be even
        //other wise it is add
        boolean isEven = num%2 ==0;
        System.out.println(num+" is even number "+isEven);

        //Ask user to enter two integer number
        //First integer you provide should be bigger than second one
        //If first number bigger than the second one we will print out  true
        //If second number bigger than the first number we will print out false.

        System.out.println("Enter you first integer number");
        int firstNumber = mySkanner.nextInt();

        System.out.println("please enter an integer but smaller than first one");
        int secondNumber = mySkanner.nextInt();

        boolean isFirstBigger = firstNumber>secondNumber;
        System.out.println(isFirstBigger);



        // To be able to graduate from school student needs %95 attendancy
        // 80 or higher grade
        // 70 of homework
        //create a program for teacher
        //teacher will enter all these variablea and if stydent passes you will print true for teacher
        //if student fails you will print false for teacher

        System.out.println("Please enter attendancy for student");
        int attendancy = mySkanner.nextInt();

        System.out.println("Please enter grade for student");
        int grade = mySkanner.nextInt();

        System.out.println("Please enter homework");
        int homework = mySkanner.nextInt();
        //How can I print for all of them
        //boolean isGrade >= 80;
        //boolean isAttend >=95;
        //boolean isHomework >=70;



        boolean isPass = attendancy>=90 && grade>=80 && homework>=70;

        System.out.println(isPass);


    }
}
