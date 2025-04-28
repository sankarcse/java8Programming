package javaTPointPrograms._4_StringPrograms;

import java.util.Arrays;
import java.util.stream.Stream;

public class _4_AnagramCheck {
    public static void main(String[] args) {
        String str1="abc";
        String str2="acb";

        boolean checkAnagram= Arrays.
                equals(str2.toLowerCase().chars().sorted().mapToObj(c->(char)c).toArray(),
                        str1.toLowerCase().chars().sorted().mapToObj(c->(char)c).toArray());


        System.out.println(checkAnagram);
    }
}
