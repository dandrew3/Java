package ternary;

import java.util.Locale;

public class TernaryPractice2 {
    public static void main(String[] args) {
        int a = 3, b = 5, k =7;
        // increment ++ / drcrement --

        int r1 = a>=k ? a + k++ : ++b + k;
        System.out.println(r1);
        System.out.println(b);
        System.out.println(k);
        int r2 = k<++b ? 2*++k-2 : --k *2-1;
        System.out.println(r2);


        System.out.println(k>=b ? "I got this" : false);

        System.out.println("test".equals("test") ? "test".toLowerCase() : 99);




    }
}
