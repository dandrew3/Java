package HomeWorkPractice;
import java.util.Scanner;
public class LoopMultiplicationTable {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int num = 1;
        int input = myScanner.nextInt();

        while (num<=10){
            System.out.println(input+"*"+num+"="+(input*num));
            num++;
        }
    }
}
