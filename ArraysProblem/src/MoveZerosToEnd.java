
public class MoveZerosToEnd {

    // Brute Force
    static int[] moveZeroToEnd(int[] arr, int n) {
        int temp[] = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        return temp;
    }

    // Optimal method : 2 pointer method
    static int[] moveZeroByPointerMethod(int[] arr, int n) {

        int j = -1;
        // here we are fining 0 and setting j value
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1)
            return arr;

        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        int n = arr.length;
        int[] temp = moveZeroByPointerMethod(arr, n);

        for (int i : temp) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
