package javaTPointPrograms._2_numberPrograms;

import java.util.Arrays;

public class _10_SpyNumber {
    public static void main(String[] args) {
        int number=123;
        boolean isSpy=_10_SpyNumber.isSpyNumber(number);
        if (isSpy == true) {
            System.out.println(number+" is spy number");
        }else
            System.out.println("not spy number");
    }

    private static boolean isSpyNumber(int number) {
       int sum= Arrays.stream(String.valueOf(number).split(""))
                        .map(Integer::parseInt)
                        .reduce(0,(integer, s) -> integer+s);
       int prod= Arrays.stream(String.valueOf(number).split(""))
               .map(Integer::parseInt)
               .reduce(1,(integer, s) -> integer*s);
        if(sum==prod)
            return true;
        return false;
    }
}
