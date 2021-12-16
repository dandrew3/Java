package primitives;

public class TruthTable2 {
    public static void main(String[] args) {
        // there is an event for kids
        //if the age of child is 6 or less OR if the height of child is 48 inches or less
        //the event is free for that child
        int reqChildAge = 6;
        int reqChildHeight = 48;

        int childAge = 7;
        double childHeight = 47;
        boolean freeticket = childAge <= reqChildAge || childHeight <= reqChildHeight;
        System.out.println(freeticket);

        // find out if student can pass a class
        // there are 3 test taken
        // average of those test has to be more than 78
        //attendance rate of the student has to be 80% or more
        //print tout if student can pass or not

        int test1 = 60;
        int test2 = 100;
        int test3 = 80;

        int reqAverage = 70;
        int reqAttendance = 80;
        int studentAttendace = 85;

        int testAvarege = (test1+test2+test3)/3;

        boolean canPass = testAvarege >= reqAverage && studentAttendace >= reqAttendance;
        System.out.println(testAvarege);
        System.out.println("Can student pass " + canPass);

    }
}
