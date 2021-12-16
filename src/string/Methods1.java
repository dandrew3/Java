package string;

public class Methods1 {
    public static void main(String[] args){

        // .concat();
        String device = "microphone";
        System.out.println(device.concat(" is an input devise"));

        // .charAt();
        char ch = device.charAt(2);
        System.out.println(ch);

        // .length();
        int letterCount = device.length();
        System.out.println(letterCount);
        device += " is expensive";
        System.out.println(device.length());
        device.concat(" device");
        System.out.println(device.length());
        device = device.concat(" device");
        System.out.println(device.length());

        // take the last char from this last version of the string
        System.out.println(device.charAt(29));
        // here we used .charAt and .length() together
        String example = "slands in 1982, as the British forces were operating 13,000 kilometres "+
                         "(8,000 mi) from home. The Royal Navy's ships were augmented by ships taken up from "+
                         "trade (STUFT), and a base was developed on remote Ascension Island.";
        char lastChar = example.charAt(example.length()-1);
        System.out.println(lastChar);
        // one more example with .charAt and .length()
        String example2 = "Thankgiving is over. The price of the turkey will go dovn, so you can find more in";
        int count = example2.length();
        char lastLetter = example2.charAt(count-1);
        System.out.println(lastLetter);
        //find the middle char of the last string
        char middleLetter = example2.charAt(count/2-1);
        System.out.println(middleLetter);
        //find the middle char of the string
        String school = "Techtorial";
        char ch3 = school.charAt(school.length()/2-1);
        System.out.println(ch3);


    }
}
