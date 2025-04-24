package javaTPointPrograms.numberPrograms;

import java.util.Map;
import java.util.stream.IntStream;

//if n+1 is perfect square then n is sunny number
public class _5_SunnyNumber {
    public static void main(String[] args) {
        int number=670;
        boolean isPerfect=_5_SunnyNumber.isPerfectSquare(number+1);
        if(isPerfect)
            System.out.println(number+" is sunny number");
        else
            System.out.println("not sunny number");
    }

    private static boolean isPerfectSquare(int number) {
       return IntStream.of(number).anyMatch(num->Math.pow((int)Math.sqrt(num),2)==num);
    }
}
