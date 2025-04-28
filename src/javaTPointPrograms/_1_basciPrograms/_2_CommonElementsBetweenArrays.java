package javaTPointPrograms._1_basciPrograms;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class _2_CommonElementsBetweenArrays {
    public static void main(String[] args) {
        Integer[] arr1={1,2,3,4,5,5};
        Integer[] arr2={4,5,6,7,8,1};

       Set<Integer> commonNums=Arrays.stream(arr1).
               filter(arr1Num->Arrays.stream(arr2).
                anyMatch(arr2Num->arr2Num==arr1Num)).collect(Collectors.toSet());
       System.out.println(commonNums);

    }
}
