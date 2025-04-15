package javaTPointPrograms;

import java.util.stream.IntStream;

public class _13_RightAngleTrianglePattern {
    public static void main(String[] args) {
        IntStream.range(0,5).forEach(i->{

            IntStream.range(0,i).forEach(j->{
                System.out.print("*");
            });
            System.out.println();
        });
    }
}
