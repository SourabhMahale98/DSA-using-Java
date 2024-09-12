
// Input: N = 6, array[] = {13,46,24,52,20,9}
// Output: 9,13,20,24,46,52
// Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52

public class Main {
    public static void main(String[] args) throws Exception {
        int arr[] = { 13, 46, 24, 52, 20, 9 };

        int sortedArray[] = SelectionSorting(arr);

        for (int i : sortedArray) {
            System.out.print(i + ",");
        }

    }

    public static int[] SelectionSorting(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            int minimumValue = i;
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    minimumValue = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minimumValue];
            arr[minimumValue] = temp;
        }
        return arr;

    }
}
