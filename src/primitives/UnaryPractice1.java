package primitives;

public class UnaryPractice1 {
    public static void main(String[] args) {
        int studentNumber = 25;
        System.out.println(studentNumber);

        studentNumber = ++studentNumber;
        System.out.println(studentNumber);
        System.out.println(studentNumber);

        int count = 5;
        System.out.println(count++);
        System.out.println(++count);

        int number = 5;
        System.out.println(number++ + number++);//shows 12 it is 8

        int result = -- number + --number + 2 - number++ *2;
        System.out.println(result);
        System.out.println(number);


        int a = ++number;
        System.out.println(a);




    }
}
