package javaTPointPrograms._3_arrayPrograms;

import java.util.Arrays;
import java.util.OptionalInt;

public class _12_SmallestAndThirdSmallest {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        //smallest
        OptionalInt number=Arrays.stream(arr).sorted().findFirst();

        //3rd smallest
         number=Arrays.stream(arr).sorted().skip(2).findFirst();

        number.ifPresentOrElse(System.out::println,() -> System.out.println("no such elements"));
    }
}
