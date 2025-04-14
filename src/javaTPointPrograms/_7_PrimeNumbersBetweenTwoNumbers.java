package javaTPointPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class _7_PrimeNumbersBetweenTwoNumbers {
    public static void main(String[] args) {
        int num1=5;
        int num2=10;

        List<Integer> primeNumbers=primeNumbersBetweenTwoNumbers(num1,num2);
        primeNumbers.stream().forEach(System.out::println);
    }


    private static List<Integer> primeNumbersBetweenTwoNumbers(int num1, int num2) {
        List<Integer> primeNumbers=new ArrayList<>();
        IntStream.range(num1,num2).forEach(i->{
            boolean[] check={true};
            IntStream.range(2,i).forEach(j->{
                if(i%j==0)
                   check[0]=false;
            });
            if(check[0]==true)
                primeNumbers.add(i);
        });
        return primeNumbers;
    }


}
