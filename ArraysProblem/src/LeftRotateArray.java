
public class LeftRotateArray {

    static int[] leftRotate(int[] arr, int n) {

        int first = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = first;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int[] leftArray = leftRotate(arr, arr.length);

        for (int i = 0; i < leftArray.length; i++) {
            System.out.print(leftArray[i] + " ");
        }
    }
}
