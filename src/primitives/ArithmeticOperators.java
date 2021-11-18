package primitives;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // addition +
        int num1 = 3;
        int num2 = 4;
        System.out.println("total is:"+ (num1+num2));
        System.out.println(num1+num2);

        int sum = num1 + num2;
        System.out.println(sum);

        //subtraction -
        int diference;
        diference = 10-num2;
        System.out.println("diference is = " + diference);

        // multiplace *
        double product = diference * num2;
        System.out.println(product);

        //division /
        double division = product / 3.0;
        System.out.println(division);

        product = product * division;
        System.out.println(product);

        int divition2 = 17/2;
        System.out.println(divition2);

        double divition3 = 5/2;
        System.out.println(divition3);

        float divition4 = 5/2f;
        System.out.println(divition4);

        float divition5 = num2/num1;
        System.out.println(divition5);

        //remainder left over % (Modules) operator
        int a = 11;
        int b = 5;
        int ramainder1 = a % b;
        System.out.println("The left over of 511/5 = " +ramainder1);

        int x = 13;
        int y = 5;
        int remainder2 = x%y;
        System.out.println(remainder2);
        System.out.println(25%21);
        System.out.println(25 % x);

        int result = a+b*x-y/a*b+x%2;



    }
}
