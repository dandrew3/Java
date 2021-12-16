package loops.forLoop;

public class Practice3 {
    public static void main(String[] args) {
        //print out every letter from the string
        String str = "Today is Snowy";
        int len = str.length();
        int index = 0;

        for (; index < len; index++) {
            System.out.print(index + "*" + str.charAt(index) + " ");

        }
        System.out.println();
        //print out only letter 'y' from the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'y') {
                System.out.println(i + " " + str.charAt(i));
            }
        }
        // count the number of letter 'n' in the given String
        int count = 0;
        for (int i = 0 ; i < str.length(); i++) {
            if (str.charAt(i) == 'n') {
                count++;
            }
        }
        System.out.println("There are "+count+" letter in the string");
    }
}