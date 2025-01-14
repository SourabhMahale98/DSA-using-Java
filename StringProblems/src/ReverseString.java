import java.util.Stack;

public class ReverseString {

    static void reverseString(String str) {

        // MEthod 1 by using charAt()
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        // Method 2 : toCharArray() method
        char ch[] = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println();

        // Method 3 : StringBuffer's reverse method
        StringBuffer s = new StringBuffer(str);
        System.out.println(s.reverse());
    }

    static void reverseWord(String word) {
        String reverse = "";
        Stack<String> reverseWord = new Stack<>();
        String str = "";
        word += " ";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                reverseWord.push(str);
                str = "";
            } else {
                str += word.charAt(i);
            }
        }

        while (!reverseWord.isEmpty()) {
            System.out.print(reverseWord.pop() + " ");
        }

    }

    static String reverseEachCharInWord(String word) {
        word += " ";
        Stack<Character> stack = new Stack<>();
        StringBuilder sBuilder = new StringBuilder();
        char[] charArr = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (charArr[i] == ' ') {
                while (!stack.empty()) {
                    sBuilder.append(stack.pop());
                }
                if (i != word.length() - 1) {
                    sBuilder.append(" ");
                }

            } else {
                stack.add(charArr[i]);
            }
        }
        return sBuilder.toString();
    }

    // in simple way using only stringbuilder
    static String reverseEachCharInWord2(String word) {
        StringBuilder result = new StringBuilder();
        StringBuilder current = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                result.append(current.reverse().append(" "));
                current.setLength(0);
            } else {
                current.append(word.charAt(i));
            }

        }
        return result.toString();

    }

    static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder reverse = new StringBuilder();
        s += " ";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == ' ' || s.charAt(s.length() - 1) == ' ') {
                continue;
            }
            if (s.charAt(i) == ' ') {
                if (s.length() > 0) {
                    stack.push(sb.toString());
                }
                sb.setLength(0);
            } else {
                sb.append(s.charAt(i));
            }
        }
        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
            if (!stack.isEmpty()) {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }

    public static void main(String[] args) throws Exception {

        String str = "Hello";
        String word = "This is an amazing program";

        // reverseString(str);

        // reverseWord(word);
        // Output:
        // “program amazing an is this”

        // i/p : "This is an amazing program";
        // o/p : "sihT si na gnizama margorp";
        // System.out.println();
        // String reverseWordByChar = reverseEachCharInWord2(word);
        // System.out.println(reverseWordByChar);

        System.out.println(reverseWords(word));
    }
}
