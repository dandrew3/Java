package string;

import java.util.Locale;

public class MethodsTask2 {
    public static void main(String[] args) {
       /* ===Task==
                String str = " Zero to Ten  ";
        - change 'Ten' with/to 'HERO'
                - make all of the string uppercase
                - remove all spaces
        - get only first three letter
        - print the length of those three letters as ==> "The length of final verison is: +  <length>"*/


        String str = "    Zero to Ten  ";
        String str1 = str.replace("Ten","Hero");
        String str2 = str1.toUpperCase();
        String str3 = str2.trim();
        String str4 = str3.replace(" ","");
        String str5 = str4.substring(0,3);
        int x =str5.length();



        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(x);


        // method chaining - you can use method ofter method
        str = "Zero to ten";
        int intResult = str.replace("Ten", "HERO").toUpperCase().trim().replace(" ","").substring(0,3).length();
        System.out.println(intResult);
        System.out.println(str.replace("Ten", "HERO").toUpperCase().trim().replace(" ","").substring(0,3).length());
    }
}
