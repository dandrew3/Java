package arrays;

import java.util.Arrays;

public class SmallerNumber {
    public static void main(String[] args) {
        int[] nums = {4,24,10,100,5,78,11,25,55};
        // find smallest number from given array

        int smallest = nums[0];
        for (int i = 1;i<nums.length; i++ ) {
            if (nums[i]<smallest) {
                smallest = nums[i];
            }
        }
        System.out.println(smallest);

        System.out.println("==========Second way===================");
        Arrays.sort(nums);
        System.out.println(nums[0]);
    }
}
