package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _2_FrequencyOfElements {
    public static void main(String[] args) {
        Integer[] arr={1,2,3,4,5,6,1,2,3,4,5,6,7};
        Arrays.stream(arr).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().forEach(System.out::println);

    }
}
