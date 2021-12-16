package string;

import java.util.Locale;

public class Methods2 {
    public static void main(String[] args) {
        // .indexOf();
        String flower = "Rose";
        int indexOfR = flower.indexOf("R");
        int indexOfR1 = flower.indexOf('R');
        System.out.println("first implementation "+indexOfR);
        System.out.println("first implementation "+indexOfR1);

        System.out.println(flower.indexOf("o"));
        // if passed more than one character java is going to find first matching letter
        System.out.println(flower.indexOf("os"));
        // if it does not find matching char/char sequence it will return -1
        System.out.println(flower.indexOf("o,s"));
        System.out.println(flower.indexOf("r"));
        System.out.println(flower.indexOf("Rose")); // 0
        System.out.println(flower.indexOf("rose"));
        System.out.println(flower.indexOf("Roses"));

        String object = "umbrellam";
        System.out.println("------>"+object.indexOf("e",4));
        System.out.println(object.indexOf("l"));
        System.out.println(object.indexOf("l",6));
        //finding second "m" in the word umbrellam.
        System.out.println(object.indexOf("m",object.indexOf("m")+1));
        System.out.println(object.length());

        String sentence = "I love lilies";
        System.out.println(sentence.indexOf("l",sentence.indexOf("i")));

        // .toUppercase();
        System.out.println(sentence.toUpperCase());
        // .toLowercase();
        System.out.println(sentence.toLowerCase());

        // making single latter uppercase
        // indexOf() returning number
        // charAt() returning char
        String str = "Just do it";
        char letter = str.charAt(str.indexOf("d"));
        String str2 = "";
        str2 +=letter;
        System.out.println(str2.toUpperCase());

    }
}
