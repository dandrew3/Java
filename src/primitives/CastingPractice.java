package primitives;

public class CastingPractice {
    public static void main(String[] args) {

        int number1 = 23;
        long l1 = number1; // implicit casting is (happens by java)
        short sh1 = (short)number1; // explicit casting

        byte by1 = 1;
        byte by2 = 2;
        //short sum1 = byby1+by2; compile time error (due to numeric promotion java wants to store the result in to larger data type (int). That's why it is not compiling
        short sum2 = (short)(by1+by2); //explicit casting
        //short sum3 = (short)by1+(short)by2; result is not casted yet

        int price = (int)750.99;
        System.out.println(price);

        double samsung = 900.45;
        int priceSamsung = (int)samsung;
        System.out.println("Samsung " + samsung);
        System.out.println("Price Samsung in int "+ priceSamsung);


    }


}
