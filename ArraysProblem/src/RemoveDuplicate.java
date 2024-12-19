import java.util.ArrayList;

//By Using 2 Pointer Method

// Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.
public class RemoveDuplicate {

    static int removeDuplicate(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }

        }
        return i++;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 1, 2, 2, 2, 3, 3, 3, 4, 4 };
        System.out.println(removeDuplicate(arr));

    }
}

// Worst case hahaha : where it will search every element in new array at every
// point
// public class RemoveDuplicate {

// static boolean isNumPresent(int num, ArrayList<Integer> uniqueNumArray) {
// for (int i = 0; i < uniqueNumArray.size(); i++) {
// if (uniqueNumArray.get(i) == num) {
// return true;
// }
// }
// return false;
// }

// static ArrayList<Integer> removeDuplicate(int[] arr) {
// ArrayList<Integer> uniqueNumArray = new ArrayList<>();

// int first = arr[0];
// int sec = Integer.MIN_VALUE;

// for (int i = 0; i < arr.length; i++) {

// if (!isNumPresent(arr[i], uniqueNumArray)) {
// uniqueNumArray.add(arr[i]);
// }
// }
// return uniqueNumArray;
// }

// public static void main(String[] args) {

// int[] arr = { 1, 2, 2, 3, 7, 7, 8, 8, 8, 9, 4, 4, 4, 5 };

// System.out.println(removeDuplicate(arr));
// }
// }
