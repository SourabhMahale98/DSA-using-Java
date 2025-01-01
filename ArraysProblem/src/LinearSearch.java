
public class LinearSearch {
    static int linearSearch(int[] arr, int num) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int num = 8;
        System.out.println(linearSearch(arr, num));

    }
}
