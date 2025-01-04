import java.util.Stack;

public class RemoveOuterParantesis {

    static String removeOuterParantesis(String str) {

        char ch[] = str.toCharArray();

        if (str.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int opened = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' && opened++ > 0) {
                sb.append(ch[i]);
            } else if (ch[i] == ')' && opened-- > 0) {
                sb.append(ch[i]);
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String str = "(()())(())(()(()))";

        System.out.println(removeOuterParantesis(str));
    }
}
