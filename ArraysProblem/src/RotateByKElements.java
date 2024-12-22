
public class RotateByKElements {

    static int[] rotateByLeft(int[] arr, int arrSize, int k) {
        int temp[] = new int[arrSize];
        int j = 0;

        for (int i = 0; i < arrSize - k; i++) {
            temp[i] = arr[k + i];
        }
        for (int i = arrSize - k; i < arrSize; i++) {
            temp[i] = arr[j];
            j++;
        }
        return temp;
    }

    static int[] rotateByRight(int[] arr, int arrSize, int k) {
        int j = 0;
        int temp[] = new int[arrSize];

        for (int i = k; i < arrSize; i++) {
            temp[j] = arr[i];
            j++;
        }
        for (int i = 0; i < k; i++) {
            temp[j] = arr[i];
            j++;
        }

        return temp;

    }

    public static void main(String[] args) {
        // int[] arr = { 3, 7, 8, 9, 10, 11, 12 };
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

        int k = 2;
        int arrSize = arr.length;
        int[] leftArray = rotateByLeft(arr, arrSize, k);
        int[] rightArray = rotateByRight(arr, arrSize, k);

        System.out.print("left rotate  : ");
        for (int i = 0; i < leftArray.length; i++) {
            System.out.print(leftArray[i] + " ");
        }
        System.out.println();
        System.out.print("Right Rotate : ");
        for (int i = 0; i < rightArray.length; i++) {
            System.out.print(rightArray[i] + " ");
        }
        System.out.println();
    }
}
