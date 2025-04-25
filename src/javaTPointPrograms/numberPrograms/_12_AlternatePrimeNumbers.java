package javaTPointPrograms.numberPrograms;

import java.util.List;
import java.util.stream.IntStream;

public class _12_AlternatePrimeNumbers {
    public static void main(String[] args) {
        Integer num=40;
      List<Integer> list=  IntStream.range(2,num).
                filter(_12_AlternatePrimeNumbers::isPrime).boxed().toList();
//      IntStream.range(0,list.size()).filter(i->i%2==0).
//              mapToObj(list::get).forEach(System.out::println);

        IntStream.range(0,list.size()).filter(i->i%2==0).
                mapToObj(i->list.get(i)).forEach(System.out::println);
    }
    private static boolean isPrime(Integer num){
        return IntStream.range(2,num).noneMatch(n->num%n==0);
    }
}
