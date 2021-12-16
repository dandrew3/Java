package string;

public class Concat {
    public static void main(String[] args) {
        String test = "Chicago";
        String number = "1";
        number+=2;
        number+=2;
        System.out.println(number);

        //String has built methods/functions you can call by using your variable
        String test1 = "Chicago";

        test1 = test1.concat(" is the best");
        test1 = test1.concat(" in the summer ");
        System.out.println(test1);
        test1 += test.concat(" Ever ");
        System.out.println(test1);

    }
}
