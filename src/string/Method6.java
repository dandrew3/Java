package string;

public class Method6 {
    public static void main(String[] args) {
        String name = "   Trchtorial Academy   ";
        // .trim(); it will remove space before and after string
        String updateName = name.trim();
        System.out.println(name);
        System.out.println(updateName);

        // .subString();
        String part1 = updateName.substring(4);
        System.out.println(part1);

        String part2 = updateName.substring(4,12); // the characters at the first index is included but char at the second index is not included
        System.out.println(part2);
    }
}
