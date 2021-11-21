package primitives;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int number = 10;
        int num = number + 5;
        System.out.println(num);

        int num1 = num/3;
        System.out.println(num1);

        long ln = 100-num1;
        System.out.println(ln);

        long longNum = 5*9;
        System.out.println(longNum);

        //% --> Remainder
        int appleNumber = 15%10; //10+5
        System.out.println(appleNumber);

        long orangeNumver = 45%11; //11+11+11+11+1
        System.out.println(orangeNumver);

        int result = 10+5*2-5/3; // 10 + 10 - 1
        System.out.println(result);

        int result1 = (10+5)*(2-5)/3; // 15 * -3 / 3 = - 45 * / 3 = -15
        System.out.println(result1);
    }
}
