package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;
import java.util.Comparator;

public class _10_SrotInDescending {
    public static void main(String[] args) {
        int[] arr={2,8,3,1,9,0,4,5,7,6};

        Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }
}
