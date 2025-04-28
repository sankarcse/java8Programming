package javaTPointPrograms._2_numberPrograms;

import java.util.stream.Stream;

public class _1_ReverseNumber {
    public static void main(String[] args) {
        int number=123456;
        int num=number;
        int rev=0;
        while(num!=0){
            int rem=num%10;
             rev=rev*10+rem;
             num=num/10;
        }
        System.out.println(rev);
        rev(number);
        java8(number);
    }

    private static void rev(int  num) {
        System.out.println(Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString()));
    }
    private static void java8(int  num){
        String string=String.valueOf(num);
       Stream.of(string).map(str->Integer.parseInt(new StringBuilder(str).reverse().toString())).forEach(System.out::println);
    }
}
