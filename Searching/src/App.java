import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int sortedArray[] = { 1, 5, 6, 7, 9, 11, 13, 15 };
        int target = 115;

        int result1 = linerSearch(sortedArray, target);
        int result2 = binarySearch(sortedArray, target);

        if (result1 != -1)
            System.out.println("Element found at index : " + result1);
        else
            System.out.println("Element not found");
    }

    public static int linerSearch(int[] sortedArray, int target) {
        int steps = 0;

        for (int i = 0; i < sortedArray.length; i++) {
            steps++;
            if (sortedArray[i] == target) {
                System.out.println("Steps need in linearSearch is :" + steps);
                return i;
            }
        }
        System.out.println("Steps need in linearSearch is :" + steps);
        return -1;
    }

    public static int binarySearch(int[] sortedArray, int target) {
        int steps = 0;
        int left = 0;
        int right = sortedArray.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            steps++;
            if (sortedArray[mid] == target) {
                System.out.println("Steps need in BinerySearch is :" + steps);
                return mid;
            } else if (target > sortedArray[mid]) {
                left = mid + 1;

            } else {
                right = mid - 1;
            }
        }
        System.out.println("Steps need in BinerySearch is :" + steps);
        return -1;
    }

}
