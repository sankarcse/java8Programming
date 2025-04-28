package javaTPointPrograms._4_StringPrograms;

import java.util.stream.IntStream;

public class _6_AllTheSubsetsOfAString {
    public static void main(String[] args) {
        String str="FUN";

        IntStream.range(0,str.length()).forEach(i->{
            IntStream.range(i+1, str.length()+1).forEach(j->
                    System.out.println(str.substring(i,j)));
        });
    }
}
