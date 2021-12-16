package ternary;

import java.util.Locale;

public class TernaryPractice {
    public static void main(String[] args) {
        int a = 2, b =3;
        // ?    :
       String result1 =  a < b ? "hello" : "Bye";
        System.out.println(result1);
       // int rasult2 = a < b ? a*b : "Text"; to be able to store the result of ternary both options has to be same data type
        System.out.println(a < b ? a*b : "Text");

        boolean result3 = a >=b ? a==b : a<b;
        System.out.println(result3);

        int result4 = 'a' > 'Z' ? 5+6+7 : 7-4-1;
        System.out.println(result4);

        String str = "David";
        String result5 = str.substring(3).equals("id")? str.toLowerCase().concat(" is number") : str.toUpperCase(Locale.ROOT).concat("is String");
        System.out.println(result5);

        System.out.println(str.equalsIgnoreCase("DAVID")? str.substring(3).toUpperCase(Locale.ROOT) : str.substring(3).toUpperCase());

        int n1 = 3;
        int n2 = 3;

        int result6 = n1%2 == 0 ? 5 : 6 ;









    }
}
