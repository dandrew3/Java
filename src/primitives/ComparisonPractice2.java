package primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {
        // there is an event for kinds if a child's heght is 48 or more they can attend this event
        // print out he result if kid can attend or not

        double childHeight = 48;
        double reqHieght = 48;
        boolean canAttend = childHeight >= reqHieght;
        System.out.println("Can this child attend the event? " + canAttend);

        // if the age of child is 6 or less it will free
        int reAge = 6;
        int kindAge = 7;
        boolean isFree = kindAge >= reAge;
        System.out.println("Is the event free for child " + isFree);



    }
}
