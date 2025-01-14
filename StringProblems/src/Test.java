
public class Test {

    static void reverseWords(String s) {
        String[] str = s.split("\\s+");
        for (String st : str) {
            System.out.print(st + " ");
        }
        System.out.println();
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]).reverse();
            result.append(sb + " ");
            sb.setLength(0);
        }
        System.out.println(result.toString().trim());
    }

    public static void main(String[] args) {
        String s = " This is the best ";
        reverseWords(s);
    }
}
