package javaTPointPrograms._4_StringPrograms;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _5_SplitIntoNEqualParts {
    public static void main(String[] args) {
        String str="aaabbbccc";

        int n=3;

        if(str.length()%n!=0)
            System.out.println("not divisible");
        else
            IntStream.iterate(0,i->i+n).
                    limit(n).
                    forEach(i-> System.out.println(str.substring(i,i+n)));

    }
}
