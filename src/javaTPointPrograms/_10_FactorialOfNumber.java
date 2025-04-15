package javaTPointPrograms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _10_FactorialOfNumber {
    public static void main(String[] args) {
        int num=0;

        int factorial=factorialOfNumber(num);
        System.out.println(factorial);
    }
    private static int factorialOfNumber(int num) {
       int fact= IntStream.range(1,num+1).reduce(1,(a,b)->a*b);
       return fact;
    }
}
