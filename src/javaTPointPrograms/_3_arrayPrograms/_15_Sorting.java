package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;

public class _15_Sorting {
    public static void main(String[] args) {
        int[] arr={2,6,3,8,9,0,3,4};

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
}
