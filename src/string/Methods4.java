package string;

import java.sql.SQLOutput;

public class Methods4 {
    public static void main(String[] args) {
        String text = "Selenium";
        // .contains(); it will check if the string given value or not, return true/false
        boolean result1 = text.contains("le");
        System.out.println(result1);
        System.out.println(text.contains("t"));
        System.out.println(text.contains("selenium"));
        System.out.println(text.contains("1"));
        System.out.println(text.contains("ium"));
        System.out.println(text.contains("lev"));

        // equals(); it checks if the fiven string has exactly same order of char. will return true/false
        System.out.println(text.equals("Selenium")); //true
        System.out.println(text.equals("nium")); //false
        System.out.println(text.equals("selenium")); //false

        // .equalIgnoreCase();
        System.out.println(text.equalsIgnoreCase("SELeniuM")); //true
        String text2 = "Java";
        System.out.println(text.equalsIgnoreCase(text2));
        //String text3 =
    }
}
