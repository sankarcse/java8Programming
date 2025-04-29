package javaTPointPrograms._4_StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class _7_LongestRepeatingSequence {
    public static void main(String[] args) {
        String str="acbdfghybdf";
        Map<String, Integer> substrCount = new HashMap<>();
        IntStream.range(0,str.length()).forEach(i->{
            IntStream.range(i + 1, str.length() + 1).forEach(j -> {
                String substr = str.substring(i, j);
                substrCount.put(substr, substrCount.getOrDefault(substr, 0) + 1);
            });
        });

        String[] longestCommonSub ={""};
        substrCount.forEach((k, v) -> {
            if(v>1&& k.length()>longestCommonSub.length){
                longestCommonSub[0]=k;
            }
        });
        System.out.println("longest commonsubsequence: "+longestCommonSub[0]);
    }
}
