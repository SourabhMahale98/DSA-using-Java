import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChars {

    // Approch1 : By using Set (Optimal soln)
    static String removeDuplicateBySets(String str) {
        Set<Character> setStr = new LinkedHashSet<>();

        char charArray[] = str.toCharArray();
        int i = 0;
        while (i < charArray.length) {
            setStr.add(charArray[i]);
            i++;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : setStr) {
            sb.append(c);
        }
        return sb.toString();
    }

    // Apprroach 2 : using stream method
    static String removeDuplicate(String str) {

        StringBuilder sb = new StringBuilder();

        str.chars().distinct().forEach(c -> sb.append((char) c));

        return sb.toString();

    }

    // Approach 3: Remove Deuplicate by using double for loop
    static String removeDuplicate2(String str) {
        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            Boolean repeted = false;
            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    repeted = true;
                    break;
                }
            }
            if (!repeted) {
                sb.append(ch[i]);
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Programming";

        String uniqueChars = removeDuplicate2(str);

        System.out.println(uniqueChars);
    }
}
