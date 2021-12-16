package Project3;

import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Available music types are Classical, Pop, and Country\nPlease enter the music type:");
        String musicType = myScanner.nextLine().toLowerCase(Locale.ROOT);
        do {
            System.out.println("TYPE OF MUSIC is not available");
            System.out.println("Available music types are Classical, Pop, and Country\nPlease enter the music type:");
            musicType = myScanner.nextLine().toLowerCase(Locale.ROOT);
        }while (musicType.equals("classical") || musicType.equals("pop") || musicType.equals("country"));



        switch (musicType) {
            case "classical":
                System.out.println("Four Seasons, Fur Elise, Finlandia, Vocalise, The Planets\nWhich one do you want to listen?");
                String song = myScanner.nextLine();
                if (song.equalsIgnoreCase("four seasons")) {
                    System.out.println("Please enter the 5$ for this song");
                    int price = myScanner.nextInt();
                    if (price==5) {
                        System.out.println("Four Seasons is playing. Enjoy the song!");
                    }else if (price<5) {
                        System.out.println(5-price+"$ is not enough. Please try later.");
                    }else if (price>5) {
                        System.out.println("You have entered "+(price-5)+"$ dollar more. Please wait for the change. Four Seasons is playing. Enjoy the song.");
                    }else {
                        System.out.println("This input is not correct");
                    }
                }else if (song.equals("fur elise")) {
                    System.out.println("Please enter the 2$ for this song");
                }else if (song.equals("finlandia")) {
                    System.out.println("Please enter the 3$ for this song");
                }else if (song.equals("vocalisa")) {
                    System.out.println("Please enter the 4$ for this song");
                }else if (song.equals("the planets")) {
                    System.out.println("Please enter the 5$ for this song");
                }else {
                    System.out.println("Name Of Song "+song+" is not available");
                }


                break;
            case "pop":
                System.out.println("2");
                break;
            case "country":
                System.out.println("3");
                break;
            default:
                System.out.println("TYPE OF MUSIC is not available");
                break;
        }



    }
}
