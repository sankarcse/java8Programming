package javaTPointPrograms;

import java.util.stream.IntStream;

public class _5_Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int[] fib={0,1};
        IntStream.range(0,n).forEach(i->{
            System.out.println(fib[0]);
            //System.out.println(fib[1]);

            int next=fib[0]+fib[1];
            fib[0]=fib[1];
            fib[1]=next;
        });

    }
}
