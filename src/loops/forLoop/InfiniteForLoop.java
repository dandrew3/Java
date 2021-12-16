package loops.forLoop;

public class InfiniteForLoop {
    public static void main(String[] args) {
        for (int k = 0; k<6; k++) {
            System.out.println("David");
        }

        // infinite loop
        int x = 0;
        for ( ; ; ) {
            System.out.println("Zack");
            x++;
            System.out.println(x);
        }

    }
}
