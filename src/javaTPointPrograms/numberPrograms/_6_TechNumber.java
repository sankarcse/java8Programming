package javaTPointPrograms.numberPrograms;

import java.util.stream.IntStream;

public class _6_TechNumber {
    public static void main(String[] args) {
        int number=1312;
       boolean isTechNumber= _6_TechNumber.isTechNumber(number);
       if(isTechNumber)
           System.out.println(number+" is tech number");
       else
           System.out.println("not tech number");
    }

    private static boolean isTechNumber(int number) {
        int len=String.valueOf(number).length();
        int sum=Integer.parseInt(String.valueOf(number).substring(0,len/2))+
                Integer.parseInt(String.valueOf(number).substring(len/2,len));
       return IntStream.of(sum).map(n->n*n).anyMatch(y->y==number);

    }
}