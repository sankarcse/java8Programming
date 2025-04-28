package javaTPointPrograms._2_numberPrograms;

import java.util.Arrays;
import java.util.stream.Collectors;

public class _8_KeithNumber {
    public static void main(String[] args) {
        int number=742;
        boolean isKeithNumber=_8_KeithNumber.isKeithNumber(number);
        if(isKeithNumber)
            System.out.println(number+" is keithNumber");
        else
            System.out.println("not keithnumber");

    }

    private static boolean isKeithNumber(int number) {
        String str= Arrays.stream(String.valueOf(number).split("")).
                collect(Collectors.joining("#"));
        while (true){
            int sum= Arrays.stream(str.split("#")).map(s->Integer.parseInt(s)).
                    reduce(0,(integer, s) -> integer+s);
            if(sum==number)
                return true;
            else if (sum>number)
                return false;

            str= Arrays.stream(str.split("#")).skip(1).
                    reduce("",(s, s2) -> s+"#"+s2)+"#"+sum;
            str=str.substring(1);

        }
    }
}
