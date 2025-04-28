package javaTPointPrograms._3_arrayPrograms;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _4_DuplicatesOfAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,1,2,3,4};
        IntStream.of(arr).boxed().
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
                entrySet().stream().filter(x->x.getValue()>1).
                forEach(x-> System.out.println(x.getKey()));

        //print array
       /* IntStream.iterate(arr.length-1,i->i-1).limit(arr.length)
                .forEach(i->System.out.println(arr[i]));*/
    }
}
