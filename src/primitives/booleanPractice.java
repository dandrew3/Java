package primitives;

public class booleanPractice {
    public static void main(String[] args) {

        int number = 11;
        System.out.println(number);

        boolean isHungry = true;
        System.out.println(isHungry);

        boolean  isLIghton = false;
        System.out.println(isLIghton);

        System.out.println(true);
        System.out.println(isHungry == isLIghton);

        isLIghton = isHungry;
        isLIghton = false;
        System.out.println("Last for Is light >>" +isHungry);
        System.out.println("Last for Is light >>" + isLIghton);


    }
}
