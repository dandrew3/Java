package loops.forLoop;

public class DigitalClock {
    public static void main(String[] args) {

        // print hours and minutes for 12 hours of a day
        // ex: 0:0 0:1 ... 0:59 1:00 1:1 1:2..........11:59
        int hour, min, sec;

        for (hour = 0; hour < 12; hour++) {

            for (min = 0; min <= 59; min++) {


                for (sec = 0; sec <= 59; sec++){
                    System.out.println(hour+" : "+min+" : "+sec);

                }
            }
        }

    }
}
