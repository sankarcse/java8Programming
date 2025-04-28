package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _1_CopyOneArrayToAnotherArray {
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 4, 5};
        int[] arr2=new int[arr1.length];
//        IntStream.range(0,arr1.length).forEach(x->arr2[x]=arr1[x]);


        IntStream.iterate(0,i->i+1).
                limit(arr1.length).
                forEach(x->arr2[x]=arr1[x]);
        Arrays.stream(arr2).forEach(System.out::println);

       /* int gcd=IntStream.iterate(Math.min(number1,number2),i->i-1).
                filter(x->number1%x==0 && number2%x==0).findFirst().orElse(1);*/
    }
}
