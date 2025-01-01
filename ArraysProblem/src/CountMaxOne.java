//Find max consecitive one's in array
public class CountMaxOne {

    static int FindMaxConsecitiveOfOne(int[] arr) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 1) {
                count = 0;
            } else {
                count++;
            }
            max = Math.max(max, count);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 1, 1, 1, 1, 0, 1 };
        System.out.println(FindMaxConsecitiveOfOne(arr));
    }
}
