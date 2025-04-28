package javaTPointPrograms._3_arrayPrograms;

import java.util.stream.IntStream;

public class _6_LargestElementInArray {
    public static void main(String[] args) {
        int[] arr=new int[10];
        arr[0]=0;

        //max
        System.out.println(IntStream.of(arr).max().getAsInt());

        //min
        System.out.println(IntStream.of(arr).min().getAsInt());

        //size or number of elements present in an array
        System.out.println(arr.length);
    }
}
