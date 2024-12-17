import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class SumOfNums {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 10, 3, 5, 22, 45, 65, 11, -232, 45, 216);
        // 1) find sum
        Optional<Integer> sum = list.stream().reduce((a, b) -> a + b);
        System.out.println("Sum of all int values are :" + sum.get());

        // 2) FInd Average of list

        double avg = list.stream().mapToInt(e -> e).average().getAsDouble();
        System.out.println("AVG is : " + avg);

        // 3) first square the numbers, then filter above value then find avg

        // double resullt = list.stream()
        // .map(e -> e * e)
        // .filter(e -> e > 50)
        // .mapToInt(e -> e)
        // .average().getAsDouble();

        // Optimized code:
        double resullt = list.stream()
                .mapToInt(e -> e * e)
                .filter(e -> e > 50)
                .average()
                .orElse(0.0);

        System.out.println("Result is :" + resullt);

        // 4) find even and odd no from list

        List<Integer> even = list.stream()
                .filter(e -> (e % 2 == 0))
                .collect(Collectors.toList());

        System.out.println("EVEN num : " + even);

        List<Integer> odd = list.stream()
                .filter(e -> (e % 2 != 0))
                .collect(Collectors.toList());

        System.out.println("Odd nums :" + odd);

        // 5)print the numbers starting with 2

        List<Integer> numStartingWith2 = list.stream()
                .map(e -> String.valueOf(e))
                .filter(e -> e.startsWith("2") || e.startsWith("-2"))
                .map(Integer::valueOf) // Here inside it is working like (e-> Interger.valueOF(e))
                .collect(Collectors.toList());

        System.out.println("Starting  with 2 : " + numStartingWith2);

        // IMP 6) find duplicate numbers

        List<Integer> list2 = Arrays.asList(2, 4, 5, 3, -2, 4, 5, 45, 21, 45, 90);

        // i) one ways using collections frequency

        Set<Integer> duplicateValues = list2.stream()
                .filter(e -> Collections.frequency(list2, e) > 1)
                .collect(Collectors.toSet());

        System.out.println("i)Duplicate numbers are : " + duplicateValues);

        // ii) using hashset
        Set<Integer> dupValue = new HashSet<>();

        Set<Integer> dup = list2.stream()
                .filter(e -> !dupValue.add(e))
                .collect(Collectors.toSet());
        System.out.println("ii)Duplicate numbers are : " + dup);

        // 7)Find max and min from list
        int max = list2.stream()
                .max(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("MAX num : " + max);

        int min = list2.stream()
                .min(Comparator.comparing(Integer::valueOf))
                .get();
        System.out.println("MIN num : " + min);

        // 8)Sorting numbers
        List<Integer> ascSorted = list2.stream().sorted().collect(Collectors.toList());
        System.out.println("ASC sorted : " + ascSorted);

        List<Integer> descSorted = list2.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("DESC Sorted :" + descSorted);

        // 9)
        // i)get first 5 numbers then add them

        int sumOf5Numbers = list2.stream().limit(5).reduce((a, b) -> a + b).get();
        System.out.println("Sum Of first 5 numbers :" + sumOf5Numbers);

        // ii)skip first 6 numbers then add remaining numbers

        int sumOfNoAfter6th = list2.stream().skip(6).reduce((a, b) -> a + b).get();
        System.out.println("Sum of no after 6th element :" + sumOfNoAfter6th);

        // 10) find second Highest and second lowest no:

        int secondHighest = list2.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
        System.out.println("second Highest No :" + secondHighest);

        int secondLowest = list2.stream().sorted().distinct().skip(1).findFirst().get();
        System.out.println("Second Lowest : " + secondLowest);
    }

}
