package javaTPointPrograms._1_basciPrograms;

import java.util.stream.IntStream;

public class _6_PrimeNumberCheck {
    public static void main(String[] args) {
        int num=2;
        if (num==0||num==1)
            System.out.println(num+" is not prime");
        else {
            boolean check= _6_PrimeNumberCheck.checkPrimeOrNot(num);
            if (check)
                System.out.println(num+" is prime");
            else
                System.out.println(num+" is not prime");
        }


    }

    private static boolean checkPrimeOrNot(int num){
        boolean[] check={true};
         IntStream.range(2,num).forEach(i->{
             if(num%i==0)
                 check[0]=false;
        });
        return check[0];
    }
}
