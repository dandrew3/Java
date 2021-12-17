package arrays;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {
        int[] zipCodes = {61212,91213,11214,71215};

        System.out.println(Arrays.toString(zipCodes)); // [61212, 91213, 11214, 71215]
        Arrays.sort(zipCodes); // it will arrange data in ascending (from smaller to larger) order
        System.out.println(Arrays.toString(zipCodes));// [11214, 61212, 71215, 91213]

        String[] color = {"violete", "Pink", "Red", "white", "black","red", "brown"};
        Arrays.sort(color);
        System.out.println(Arrays.toString(color));
    }
}
