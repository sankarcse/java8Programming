package javaTPointPrograms._4_StringPrograms;

import java.util.regex.Pattern;

public class _2_TotalPunctuationchars {
    public static void main(String[] args) {
        String str="He said, 'The mailman loves you.' I heard it with my own ears.";

       int totalPunctuations= (int) str.chars().
        mapToObj(c->(char)c).
        filter(c->Pattern.matches("\\p{Punct}",c.toString())).count();

        System.out.println(totalPunctuations);

    }
}
