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
            System.out.print(reverseWord.pop()+ " ");
        }

    }

    public static void main(String[] args) throws Exception {

        String str = "Hello";
        String word = "This is an amazing program";

        // reverseString(str);

        reverseWord(word);
        // Output:
        // “program amazing an is this”
    }
}
