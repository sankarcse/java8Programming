package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;

public class _9_SortInAscending {
    public static void main(String[] args) {
        int[] arr={6,3,1,8,0,2,4,5,7,9};

        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
