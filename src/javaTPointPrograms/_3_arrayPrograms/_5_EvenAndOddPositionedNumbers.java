package javaTPointPrograms._3_arrayPrograms;

import java.util.stream.IntStream;

public class _5_EvenAndOddPositionedNumbers {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6};
        //even positioned numbers
        IntStream.range(0,arr.length).filter(i->i%2==0).
                forEach(i-> System.out.println(arr[i]));
        //odd positioned numbers
        IntStream.range(0,arr.length).filter(i->i%2!=0).
                forEach(i-> System.out.println(arr[i]));
    }
}
