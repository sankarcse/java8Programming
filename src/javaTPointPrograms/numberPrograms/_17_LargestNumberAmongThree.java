package javaTPointPrograms.numberPrograms;

import java.util.stream.IntStream;

public class _17_LargestNumberAmongThree {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        // with ternary operator

        //int largest=(a>b)?(a>c?a:c):(b>c?b:c);

        //java8 way
       int largest= IntStream.of(a,b,c).max().getAsInt();
        System.out.println(largest);
    }
}
