package javaTPointPrograms.numberPrograms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class _13_NthPrimeNumber {
    public static void main(String[] args) {
        int num=10;
        IntStream.range(2, Integer.MAX_VALUE).
                filter(_13_NthPrimeNumber::isPrime).boxed()
                .limit(num).toList().stream().skip(num-1).forEach(System.out::println);
    }

    private static boolean isPrime(int num){
        return IntStream.rangeClosed(2,(int)Math.sqrt(num)).noneMatch(x->num%x==0);
    }
}
