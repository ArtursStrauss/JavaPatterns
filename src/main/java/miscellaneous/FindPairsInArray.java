package miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class FindPairsInArray {
    public static void main(String[] args) {
        int[] ints = {2, 5, 7, 8, 2, 3, 5, 6, 5, 6, 6, 6, 8, 8, 8};

        List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
        int result = list
                .stream()
                .collect(Collectors.groupingBy(e -> e))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .map(e -> e.getValue().size()).mapToInt(i -> i / 2).sum();

        System.out.println(result);
    }
}
