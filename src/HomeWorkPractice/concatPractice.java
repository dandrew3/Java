package HomeWorkPractice;

public class concatPractice {
    public static void main(String[] args) {
        String str1 = "www";
        String str2 = "bestbuy";
        String str3 = "com";


        String webSite = str1.concat(".").concat(str2).concat(".").concat(str3);
        System.out.println("Our web site is: " + webSite);
    }
}
