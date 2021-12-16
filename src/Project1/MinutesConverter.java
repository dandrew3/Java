package Project1;

public class MinutesConverter {
    public static void main(String[] args){

        int minutes = 3456789; // Declaring integer variable adn initializing it
        int days = minutes/60/24; // For converting minutes in days we have dividing days variable by 60 minutes and 24 hours
        int years = days/30/12; // For converting days in years we need divide days by 30 (days in month) and 12 (moth in one year)

        int daysResult = days % (years*365); // For calculating days which remain after converting operation we need
                                            // years variable multiply by 365 (days in year) and find out reminder
                                            // from days which we received in previous calculation by number which we received

        // For getting result in console we need to specified out variables in parentheses
        // For adding text in output result we have to take this text in double quotation and add symbol +
        System.out.println(minutes+" minutes is approximately "+years+" years and "+daysResult+" days");

    }
}
