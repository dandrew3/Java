package loops.forLoop;

public class NestedPractice {
    public static void main(String[] args) {

        System.out.println("Beginning of the loop");
        for ( int i = 0; i < 3 ; i++ ) {
            System.out.println("I am FIRST for loop");

            for (int j = 0; j<5; j++) {
                System.out.println("I am NESTED for loop");

            }
        }
        System.out.println("End of the loop");

    }
}
