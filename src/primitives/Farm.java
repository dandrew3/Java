package primitives;

public class Farm {
    public static void main(String[] args) {
        /*
        in a farm, there are 12 cowa and 23 chickens
        1 - find the total legs of the animals in the farm and print out
        2 - if each cow xosts $ 2345 and each chicken costs $23.99
        find the total worth of these animals and print out
         */
        int cows = 12;
        int chicken = 23;
        int cowsleg = cows * 4;
        int chickenleg = chicken * 2;
        int totalcowleg = cowsleg+chickenleg;
        System.out.println("Total legs of the animals: " + totalcowleg);


        double pricechikens = 23.99 * chicken;
        double pricecows = 2345 * cows;
        double allprice = pricechikens+pricecows;
        System.out.println("Total worth = " + allprice);
    }
}
