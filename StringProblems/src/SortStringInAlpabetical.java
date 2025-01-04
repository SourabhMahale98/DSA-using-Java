import java.util.Arrays;

public class SortStringInAlpabetical {

    // By using sort() method
    static String sortByAlpabetical(String str) {
        // this is also works fine
        // StringBuilder sb = new StringBuilder();
        // str.chars().sorted().forEach(c -> sb.append((char) c));

        char ch[] = str.toCharArray();

        Arrays.sort(ch);
        return new String(ch);
    }

    static String sortByAlpabetical2(String str) {

        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] > ch[j]) {
                    char cTemp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = cTemp;
                }
            }
        }
        return new String(ch);

    }

    public static void main(String[] args) {
        String str = "m ahale";

        String sortedStr = sortByAlpabetical2(str);
        System.out.println(sortedStr);
    }
}
