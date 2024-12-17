import java.util.Scanner;

public class Test {

    boolean isUnique(String str) {
        if (str.length() > 128)
            return false;

        boolean[] char_at = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);

            if (char_at[val]) {
                return false;
            }
            char_at[val] = true;

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        Test test = new Test();

        Boolean strUnique = test.isUnique(str);
        System.err.println(strUnique);
    }
}
