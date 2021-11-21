package primitives;

import java.sql.SQLOutput;

public class CompoundAssignments {
    public static void main(String[] args) {
        //+= -= *= /= %=
        int num1 = 7;
        int num2 = num1 +7;
        num1+=num2;
        System.out.println(num1);

        num2 -= 8;
        System.out.println(num2);

        int num3 = num1 + num2;
        num2 +=num3;
        num1 +=num3;
        System.out.println(num3);
        System.out.println(num2);
        System.out.println(num1);


        num1 = 4;
        num1 *=5;
        System.out.println(num1);

        num1 /= 4;
        System.out.println(num1);

        num1 %=2;
        System.out.println(num1);

              char ch1 = 'a';
              char ch2 = 'm';
              char ch3 = 't';

              ch3+= 'a';
              System.out.println(ch3);

              ch2 -= '3';
              System.out.println(ch2);

              int remainder = ch1%3;
             System.out.println(remainder);

              ch1 %= 2;
             System.out.println(ch1);


             int myint = 5;
        System.out.println(myint);
             myint += 6;
        System.out.println(myint);
        myint *=10;
        System.out.println(myint);




    }
}
