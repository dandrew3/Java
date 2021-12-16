package arrays;

import java.util.Arrays;

public class Practice2 {
    public static void main(String[] args) {
        int [] numbers = {4,3,6,11,89,75};
        System.out.println(numbers[3]);

       // numbers[6] = 66; //Index 6 out of bounds for length 6
        numbers[1] = 88;
        System.out.println(numbers[1]);
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
        for (int m = 0; m<numbers.length; m++) {
            System.out.println(numbers[m]);
        }
    }
}
