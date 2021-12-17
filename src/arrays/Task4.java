package arrays;

public class Task4 {
    public static void main(String[] args) {
// find the sum of numbers which are less than 10 from given array
String name = "Andrew";
        int[] arr = {4,24,10,100,5,78,11,7,25,55,-3,name.length()};
        int sum = 0;
        for (int i = 0;i <arr.length; i++ ) {
         if (arr[i]<10) {
        sum += arr[i];
    }
}
        System.out.println(sum);
    }
}
