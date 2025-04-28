package javaTPointPrograms._2_numberPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _7_FascinatingNumber {
    public static void main(String[] args) {
        int number=327;
        boolean isfascinatingNumber=_7_FascinatingNumber.isFascinatingNumber(number);
        if(isfascinatingNumber)
            System.out.println(number+" is fascinating number");
        else
            System.out.println("not fascinating number");

    }

    private static boolean isFascinatingNumber(int number) {
        if (String.valueOf(number).length()<3)
            return false;
        else{
            String sum=number+""+(number*2)+""+(number*3);
            Map<Character, Long> frequencyMap=  sum.chars().mapToObj(c->(char)c)
                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
           if(frequencyMap.values().stream().anyMatch(v->v==0 || v>1))
               return false;
        }
        return true;
    }
}
