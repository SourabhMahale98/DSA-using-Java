
public class ReplaceCharByOccurance {

    static String replaceCharByOccurance(String str, String singleChar) {

        if (str == null || singleChar == null | singleChar.length() != 1) {
            throw new IllegalArgumentException(
                    "Input string and singleChar must not be null, and singleChar must contain exactly one character.");
        }

        int count = 1;
        char c = singleChar.charAt(0);
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char currentChar : charArray) {
            if (currentChar == c) {
                sb.append(count++);
            } else {
                sb.append(currentChar);
            }

        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String str = "OPENTEXT";
        String ch = "T";

        String replacedString = replaceCharByOccurance(str, ch);
        System.out.println(replacedString);

    }
}
