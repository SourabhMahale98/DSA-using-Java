import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamsQues {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(2, 5, 3, 4, 6, 8, 9, 10);

        // i)Return list of even numbers

        List<Integer> even = nums.stream().filter(e -> (e % 2 == 0)).collect(Collectors.toList());
        System.out.println(even);

        // ii)Find Max value
        Optional<Integer> max = nums.stream().max(Integer::compare);
        System.out.println(max);

        // iii)sum of elements
        Optional<Integer> sum = nums.stream().reduce((x, y) -> x + y);
        System.out.println("Sum : " + sum);

        // iv)makes names uppercase
        List<String> names = Arrays.asList("Sdm", "Pratik", "shubham");
        List<String> capitalNames = names.stream().map((n) -> n.toUpperCase()).collect(Collectors.toList());
        System.out.println(capitalNames);

        //v)

    }
}
