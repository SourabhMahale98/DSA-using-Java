public class SecondLargest {
    public static void main(String[] args) throws Exception {

        int arr[] = { 12, 35, 1, 10, 34, 1 };

        int secondLargest = secondLargest(arr);

        System.out.println(secondLargest);
    }

    public static int[] selectionSort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            System.out.println("Max number " + arr[max] + "\n Array of i :" + arr[i]);
        }
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }
        return arr;
    }

    public static int secondLargest(int[] arr) {

        arr = selectionSort(arr);
        if (arr.length >= 2) {
            int second = arr[1];
            return second;
        }
        if (arr[0] == arr[1]) {
            return -1;
        }

        return -1;
    }
}
