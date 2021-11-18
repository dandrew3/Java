package primitives;

public class RemainderPractice1 {
    public static void main(String[] args) {
        //modulus % remainder (left over after division)
        int number1 = 45;
        int number2 = 6;
        int remainder1 = number1 % number2;
        System.out.println("Remainder1 is: :" + remainder1);


        // Find some of the digits from given number
        // 123 --> 1+2+3=6-->south(sum is>> <sum>)
        // 12 % 10 --> 2
        // 123 % 10 --> 3
        // 1 % 10 --> 1
        int myNumber = 123;
        int digit3 = myNumber % 10;
        myNumber = myNumber/10;
        int digit2 = myNumber % 10;
        myNumber = myNumber/10;
        int diget1 = myNumber % 10;
        System.out.println(diget1);
        System.out.println(digit2);
        System.out.println(digit3);

        int sum = diget1+digit2+digit3;
        System.out.println("The sum is = " + sum);
    }

}
