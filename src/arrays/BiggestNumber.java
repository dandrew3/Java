package arrays;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] nums = {4,24,10,100,5,78,11,25,55};
        // find biggest number from given array

        int biggest = nums[0];
        for (int i = 1;i<nums.length; i++ ) {
            if (nums[i]>biggest) {
                biggest = nums[i];
            }
        }
        System.out.println(biggest);

        System.out.println("==========Second way===================");
        Arrays.sort(nums);
        System.out.println(nums[nums.length-1]);
    }
}
