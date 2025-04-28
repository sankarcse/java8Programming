package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Optional;

public class _11_ThirdLargestInArry {
    public static void main(String[] args) {
        int[] arr={0,8};

        Optional<Integer> third=Arrays.stream(arr).boxed().
                sorted(Comparator.reverseOrder()).skip(2).findFirst();

       third.ifPresent(System.out::println);
       third.orElseThrow(() -> new NoSuchElementException("No third largest element"));
    }
}
