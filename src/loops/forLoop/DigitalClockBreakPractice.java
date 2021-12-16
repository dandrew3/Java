package loops.forLoop;

public class DigitalClockBreakPractice {
    public static void main(String[] args) {

        // print hours and minutes for 12 hours of a day
        // ex: 0:0 0:1 ... 0:59 1:00 1:1 1:2..........11:59
        int hour, min, sec;
        outher:
        for (hour = 0; hour < 12; hour++) {
            if (hour >=6 && hour<=8) {
                continue;
            }
            inner:
            for (min = 0; min <= 59; min++) {
                if (min >= 30) {
                    break ;
                }

                for (sec = 0; sec <= 59; sec++){
                    System.out.println(hour+" : "+min+" : "+sec);
                    if (sec == 10) {
                        break inner;
                    }

                }
            }
        }

    }
}
