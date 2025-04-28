package javaTPointPrograms._2_numberPrograms;

import java.util.Arrays;
import java.util.stream.IntStream;

public class _4_PetersonNumber {
    public static void main(String[] args) {
        int num=123;
        System.out.println(Arrays.stream(String.valueOf(num).split("")).map(c->Integer.parseInt(c)).
                map(_4_PetersonNumber::factorialOfNumber).reduce(Integer::sum).get());

    }

    private static int factorialOfNumber(int num) {
       int fact= IntStream.rangeClosed(1,num).reduce(1,(left, right) -> {
           int i = left * right;
           return i;
       });
        return fact;
    }


}
