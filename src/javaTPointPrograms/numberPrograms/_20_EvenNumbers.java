package javaTPointPrograms.numberPrograms;

import java.util.stream.IntStream;

public class _20_EvenNumbers {
    public static void main(String[] args) {
        //even
        IntStream.rangeClosed(1,100).filter(x->x%2==0).forEach(System.out::println);

        //odd
        IntStream.rangeClosed(1,100).filter(x->x%2!=0).forEach(System.out::println);

        //sum of natural numbers
        System.out.println(IntStream.rangeClosed(1,100).
                reduce((left, right) -> left+right).getAsInt());


    }
}
