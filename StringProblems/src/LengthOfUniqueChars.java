import java.util.HashSet;
import java.util.Set;

public class LengthOfUniqueChars {

    static String lengthOfUniqueChars(String str) {
        Set<Character> charSet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        return charSet.toString();
    }

    public static void main(String[] args) {
        String str = "abbac";
        System.out.println(lengthOfUniqueChars(str));
    }
}
