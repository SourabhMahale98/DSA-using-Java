
//Display distinct nums only

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfArrays {

    static List<Integer> unionOfArrays(int arr1[], int arr2[]) {
        Set<Integer> set = new HashSet();
        ArrayList<Integer> union = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        for (Integer integer : set) {
            union.add(integer);
        }
        Collections.sort(union);
        return union;
    }

    public static void main(String[] args) {

        int[] arr1 = { -999705662, -999579417, -993969222, -992720144, 988583067, 993649414, 996963475, 997953467,
                998551465 };
        int[] arr2 = { -998815035, -998162808, 989513087, 993031068, 995067333, 995920643, 996660467, 996796961,
                997135054, 999390289 };

        List<Integer> union = unionOfArrays(arr1, arr2);

        System.out.println(union);
    }
}
