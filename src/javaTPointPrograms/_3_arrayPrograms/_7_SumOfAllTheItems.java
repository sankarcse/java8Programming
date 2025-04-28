package javaTPointPrograms._3_arrayPrograms;

import java.util.stream.IntStream;

public class _7_SumOfAllTheItems {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(IntStream.of(arr).sum());
    }
}
