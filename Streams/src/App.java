
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) throws Exception {

        // How foreach works with list
        List<Integer> nums = Arrays.asList(3, 5, 7, 4, 1, 2);

        // 1) way to use foreach loop
        // for (int n : nums) {
        // System.out.println(n);
        // }

        // 2) another to use forEach loop
        // nums.forEach(n -> System.out.println(n));

        // 3) internal function of forEach loop
        // because of consume interfave which is functional interface we can use lambda
        // function
        Consumer<Integer> numbers = t -> System.out.println(t);

        nums.forEach(t -> System.out.println(t));
    }
}
