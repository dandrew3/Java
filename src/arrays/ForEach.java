package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEach {
    public static void main(String[] args) {
        String[] str = {"Apple", "Orange", "Bluberry", "Lemon"};

        for (String i : str) {      // for each - it is a faster way for shows array elements one by one
            System.out.println(i);
        }
        System.out.println(Arrays.toString(str));
    }
}
