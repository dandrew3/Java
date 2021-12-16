package ifStatement;

public class ifPractice {
    public static void main(String[] args) {
        int appleNumber = 5;
        int orangeNumber = 10;
        // ==, >,<,!=,<=,>=
        System.out.println("I am about to create an IF block");
        if (appleNumber==orangeNumber){
            System.out.println("I am so lucky today");
        }

        if (appleNumber!=orangeNumber) {
            System.out.println("I am so happu today");
        }
        if (appleNumber<=orangeNumber) {
            int sum = appleNumber + orangeNumber;
            System.out.println("You have " + sum + "fruits");
        }

            System.out.println("So far as good");

        if (orangeNumber<appleNumber){
            System.out.println(orangeNumber+appleNumber+"is in the false condition if block. That is why it will not show on the console");
        }

    }
}
