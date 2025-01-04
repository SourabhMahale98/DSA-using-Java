
public class RemoveSpecialChars {

    static void remove1(String str) {
        String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.print(plainStr);
        System.out.println();
    }

    static void removeSpace(String str) {
        String plainStr = str.replaceAll(" ", " ");
        System.out.print(plainStr);
        System.out.println();
    }

    public static void main(String[] args) {

        String str = "J a  vasta r";

        remove1(str);
        removeSpace(str);

    }
}
