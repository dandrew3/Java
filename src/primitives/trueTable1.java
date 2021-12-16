package primitives;

public class trueTable1 {
    public static void main(String[] args) {
        // visa and ticket
        boolean visa = true;
        boolean ticket = true;

        boolean myVisa = false;
        boolean myTicket = true;

        boolean canTravel = visa == myVisa  && ticket == myTicket;
        System.out.println(canTravel);

        // ask question
        boolean online = true;
        boolean campus = true;
        boolean students = true;
        boolean askQuestion = students == online || students == campus;
        System.out.println("Can you ask question? " + askQuestion);


        // 90% or more attendance and score of 80 and more to pass this class
        int reqAttendance = 90;
        int reqScore = 80;
        int yourAttendance = 100;
        int yourScore = 90;
        boolean passClas = yourAttendance >= reqAttendance && yourAttendance >= reqScore;
        System.out.println("Can I pass course " +
                passClas);


    }
}
