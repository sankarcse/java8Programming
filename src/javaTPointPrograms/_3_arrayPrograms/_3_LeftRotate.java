package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _3_LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int n = 3;

       IntStream.range(0,n).forEach(i->leftRotateByOnePosition(arr));

        // Print the final array
        Arrays.stream(arr).forEach(System.out::print);
    }

    private static void leftRotateByOnePosition(int[] arr){
        int temp=arr[0];
        IntStream.range(0,arr.length-1).forEach(i->arr[i]=arr[i+1]);
        arr[arr.length-1]=temp;
    }
}
