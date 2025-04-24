package javaTPointPrograms.numberPrograms;

import java.util.Scanner;
import java.util.stream.IntStream;

public class _3_AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        boolean isautomorphic=IntStream.of(num).map(x->{
            int len=String.valueOf(x).length();
            int tail=(x*x)%(int) Math.pow(10, len);
            return tail;
        }).anyMatch(x->x==num);
        if (isautomorphic)
            System.out.println(num+" is automorphic");
        else
            System.out.println(num+" is not automorphic");
    }

}
