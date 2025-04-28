package javaTPointPrograms._4_StringPrograms;

import java.util.stream.Stream;

public class _1_TotalNumberOfCharactersInString {
    public static void main(String[] args) {
        String str="sankarthota";

       int num= (int) str.chars().count();
        System.out.println(num);
    }
}
