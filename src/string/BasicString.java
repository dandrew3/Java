package string;

public class BasicString {
    public static void main(String[] args) {
        String word = "Tech";
        System.out.println(word);

        String word2 = new String("Tech"); //extra for string
        System.out.println(word2);

        String word3 = "Tech" + "Torial";
        System.out.println("word3: " + word3);

        System.out.println(word + "JAVA");
        System.out.println(word);
        System.out.println(word + "77");
        System.out.println(word + 7+ 8);
       //System.out.println(word + 7-8);
        System.out.println(word + 7*8);
        System.out.println(7+8 +word+7+8); // 15Tech78
        word += "torial";
        System.out.println(word);
        word += 33;
        System.out.println(word);

        String str = "just do it ";
        System.out.println(str);

        String str1 = new String("What ever it takes!)");
        System.out.println(str1);

        System.out.println(str+str1);
    }
}
