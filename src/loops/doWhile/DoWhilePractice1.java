package loops.doWhile;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        //find and show sum of the numbers betwen 10 to 20 by using do-while loop
        int a =1;
        int b = 3;
        int sum = 0;

        do {
            sum +=a;
            a++;
        }while (a<=b);
        System.out.println("sum is: "+sum);
    }
}
