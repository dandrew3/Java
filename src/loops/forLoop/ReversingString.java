package loops.forLoop;

public class ReversingString {
    public static void main(String[] args) {
        // reverse given string
        String str = "Lets do it";
        String revars = "";

        for (int i = str.length()-1; i >= 0; i--) {
            revars += str.charAt(i);

        }
        System.out.println(str);
        System.out.println(revars);
    }
}
