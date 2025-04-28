package javaTPointPrograms._4_StringPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _3_VowelsAndConsonents {
    public static void main(String[] args) {
        String str="sankarthota";

      str.chars().mapToObj(c->(char)c).filter(c->c=='a'||c=='e'||c=='i'||c=='o'||c=='u').
              collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println();
      str.chars().mapToObj(c->(char)c).filter(c->c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u').
              collect(Collectors.toSet()).forEach(System.out::println);

        //System.out.println("vowels:"+vowels+","+"consonants:"+consonants);
    }
}
