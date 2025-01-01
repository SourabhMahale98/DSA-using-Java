
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Display distinct nums only
//using two Pointer method
public class UnionOfArrays2 {

    static List<Integer> unionOfArrays(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {

                if (union.size() == 0 || union.get(union.size() - 1) != arr1[i])
                    union.add(arr1[i]);
                i++;

            } else {
                if (union.size() == 0 || union.get(union.size() - 1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }

        }
        while (j < n) {
            if (union.get(union.size() - 1) != arr2[j]) {
                union.add(arr2[j]);

            }
            j++;
        }
        while (i < m) {
            if (union.get(union.size() - 1) != arr1[i]) {
                union.add(arr1[i]);

            }
            i++;
        }

        return union;
    }

    public static void main(String[] args) {

        // int[] arr1 = { -999705662, -999579417, -993969222, -992720144, 988583067,
        //
        // 993649414 };
        //
        // int[] arr2 = { -9 98 81 50 3 5, -998162808, 989513087, 993031068, 995067333,
        // 995920643, 99 66 60 46 7 };
        int[] arr1 = { 1, 1, 2, 3, 4, 5, 7, 8, 8, 9 };
        int[] arr2 = { 2, 3, 4, 4, 5, 30, 70 };

        List<Integer> union = unionOfArrays(arr1, arr2);

        for (Integer integer : union) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
