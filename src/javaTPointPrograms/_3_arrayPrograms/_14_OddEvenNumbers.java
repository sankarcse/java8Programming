package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _14_OddEvenNumbers {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8,9};

        Arrays.stream(arr).boxed().filter(i->i%2!=0).
                collect(Collectors.toList()).forEach(System.out::println);

    }
}
