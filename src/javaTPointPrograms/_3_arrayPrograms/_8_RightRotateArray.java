package javaTPointPrograms._3_arrayPrograms;

import java.util.stream.IntStream;

public class _8_RightRotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        int n=3;

        IntStream.range(0,n).forEach(i->rotateRight(arr));

        IntStream.of(arr).forEach(System.out::println);

    }
    private static void rotateRight(int[] arr){
        int temp=arr[arr.length-1];
        IntStream.iterate(arr.length-1,i->i-1).limit(arr.length-1).forEach(i->arr[i]=arr[i-1]);
        arr[0]=temp;
    }
}
