package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _13_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5,5,6,6};

        Arrays.stream(arr).distinct().boxed().collect(Collectors.toList()).forEach(System.out::println);
    }
}
