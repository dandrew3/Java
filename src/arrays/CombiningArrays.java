package arrays;

import java.util.Arrays;

public class CombiningArrays {
    public static void main(String[] args) {
        // Combine these two arrays in to another array
        int[] nums1 = {1,3,5};
        int[] nums2 = {6,8,9,7};
        int[] result = new int[nums1.length+nums2.length];


        for ( int i = 0  ; i < nums1.length; i++ ) {
            result[i] = nums1[i];
        }
        for (int b = nums1.length, c = 0; b < result.length; b++, c++) {
        result[b]  = nums2[c];
        }
        System.out.println(Arrays.toString(result));
    }
}
