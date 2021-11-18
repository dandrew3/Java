package primitives;

public class RemainderPracrice2 {
    public static void main(String[] args) {
        //find the product of digits from given number
        // 456 ==> 4*5*6 = 120 south ("The product is = "+<product>

        int myNumber = 456;
        int digit1 = myNumber % 10;
        myNumber = myNumber/10;

        int digit2 = myNumber % 10;
        myNumber = myNumber/10;

        int digit3 = myNumber % 10;
        myNumber = myNumber/10;

        int sum = digit1*digit2*digit3;
        System.out.println("The product is " + sum);
    }
}
