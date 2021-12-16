package loops.forLoop;

public class PalindromePractice {
    public static void main(String[] args) {

        //civic, ana
        String str = "civic";
        String revars = "";

        for (int i = str.length()-1; i >= 0; i--) {
            revars += str.charAt(i);

        }
        if (revars.equals(str)) {
            System.out.println("it is a palindrome string");
        }else {
            System.out.println("it is NOT a palindrome string");
        }
        // find out if given number is palindrome number or not
        int number = 1234321;
        String str1 = ""+number;



    }
}
