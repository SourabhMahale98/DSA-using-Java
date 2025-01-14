
//ip : AABCDBE
//op : C
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindingFirstNonRepetedChar {

    static void firstNonRepetedChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(str.charAt(i));
                break;
            }
        }

    }

    static Character firstNonRepetedCharByCollection(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {
                map.put(str.charAt(i), 1);
            }

        }
        System.out.println(map);

        // Character noRepeat = map.entrySet().stream().filter(entry ->
        // entry.getValue().equals((int) 1))
        // .map(Map.Entry::getKey).findFirst().orElse(null);
        char noRepeat = '\0';
        for (Entry<Character, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() == 1) {
                noRepeat = entrySet.getKey();
                break;
            }
        }

        return noRepeat;
    }

    static void OccuranceOfEachChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
    }

    public static void main(String[] args) {
        String str = "AABCCDBE";

        // Character c = firstNonRepetedCharByCollection(str);
        System.out.println("First Non repetative char : " + firstNonRepetedCharByCollection(str));

        OccuranceOfEachChar(str);
    }
}
