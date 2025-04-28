package javaTPointPrograms._2_numberPrograms;

import java.util.Arrays;

public class _9_NeonNumber {
    public static void main(String[] args) {
        int number=45;
        boolean isNeon=isNeonNUmber(number);
        if(isNeon)
            System.out.println(number+" is neon number");
        else
            System.out.println("not neon number");
    }

    private static boolean isNeonNUmber(int number) {

        int result=Arrays.stream(String.valueOf((int) Math.pow(number,2)).split("")).
                map(Integer::parseInt).reduce(0,(n1, n2) ->n1+n2 );
        if (result==number)
            return true;
        return false;
    }
}
