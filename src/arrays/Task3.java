package arrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        // print out numbers that are greater than 10
        int[] arr = {4,24,10,100,5,78,11,7,25,55};

        int[] largesValue = new int[arr.length];
        for (int i = 0;i<arr.length; i++) {
            if (arr[i] > 10) {                        //specified bound which number should be print
                largesValue[i] = arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println(Arrays.toString(largesValue));
        Arrays.sort(largesValue);
        System.out.println(Arrays.toString(largesValue));
    }
}
