package Project1;

public class MinutesConverter {
    public static void main(String[] args){
        int minutes = 3456789;
        int hours = minutes/60;
        int days = hours/24;
        int years = days/365;


        int daysInYears = years*365;
        int daysLeft = days%daysInYears;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + daysLeft);


    }
}
