package javaTPointPrograms._2_numberPrograms;

import java.util.stream.IntStream;

public class _16_GCD {
    public static void main(String[] args) {
       int number1=12;
        int number2=8;
       /* List<Integer> list2=IntStream.rangeClosed(1,number1).filter(x->number2%x==0).boxed()
                .sorted(Comparator.reverseOrder()).toList();
       int list1=IntStream.rangeClosed(1,number1).filter(x->number1%x==0).boxed()
                .sorted(Comparator.reverseOrder()).filter(list2::contains).toList().stream().findFirst().get();

        System.out.println(list1);*/

        int gcd=IntStream.iterate(Math.min(number1,number2),i->i-1).
                filter(x->number1%x==0 && number2%x==0).findFirst().orElse(1);
        System.out.println(gcd);





    }
}
