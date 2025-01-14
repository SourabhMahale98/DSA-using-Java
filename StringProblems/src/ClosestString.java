import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ClosestString {

    static int closestString(ArrayList<String> arr, String w1, String w2) {

        int minDistance = Integer.MAX_VALUE;
        int first = -1;
        int second = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(w1)) {
                first = i;
            }
            if (arr.get(i).equals(w2)) {
                second = i;
            }
            if (first != -1 && second != -1) {
                minDistance = Math.min(minDistance, Math.abs(first - second));
            }
        }
        // minDistance = second - first;
        return minDistance;
    }

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("jd", "lzt", "kym", "ky", "gdf", "jd"));

        int dist = closestString(arr, "kym", "gdf");
        System.out.println(" distance is " + dist);
    }
}
