package Project1;

public class DistanceConverter {
    public static void main(String[] args) {

        float oneInch = 1;
        float INCH = 2000.0f;
        float meter = oneInch*0.0254f;
        float totalMeters = meter*INCH;

        System.out.println(INCH + " inch is " + totalMeters + " meters");

    }
}
