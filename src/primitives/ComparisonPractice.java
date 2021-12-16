package primitives;

public class ComparisonPractice {
    public static void main(String[] args) {

        // ==
        float fl = 4.0f;
        int i = 4;
        System.out.println(fl == i);
       boolean comp1 = fl == i;
        System.out.println(comp1);

        System.out.println(18 == 18);
        System.out.println('a' == 'a');
        System.out.println("tekst" == "teksT");

        // !=
        int num1 = 55;
        int num2 = 66;
        boolean comp2 = num2 != num1; //true
        System.out.println(comp2);
        System.out.println(18 != 18);  //false


        // < less than
        System.out.println(num1 < num2); //true
        System.out.println(55 < num1); //false 55<55? no
        System.out.println('c' < 'c'); //false
        System.out.println('c' < 'd'); //true

        // > grater than
        System.out.println(num1 > num2); //false
        System.out.println(num2 > 109); //false
        System.out.println(num2++ > 66); //false
        System.out.println(num2 > 66); //true

// <= less than equal
        num1 =2; num2 = 3;
        System.out.println(num1 < num2);
        System.out.println(num1 <= num2);
        System.out.println(3 <= num2);
        num1++;
        System.out.println(num1 <= num2);
        System.out.println(++num1 <= ++num2);

        // >= grater than or equal
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(7>= ++num1 +num2); //false

        char ch3 = 'P';
        char ch4 = 80;
        System.out.println(ch3 == ch4); // true






    }
}
