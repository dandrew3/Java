package string;

public class Method5 {
    public static void main(String[] args) {
        String word = "Sunday";
        // replace()
        String updateWord = word.replace("a","$");
        System.out.println(updateWord);
        String updateWord1 = word.replace("Sun","Satur");
        System.out.println(updateWord1);
        System.out.println(word.replace("day","*"));
        System.out.println(word.replace("sun","Satur"));
        String code = "java";
        System.out.println(code.replace('a','%'));
    }
}
