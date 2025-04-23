package javaTPointPrograms.numberPrograms;

import java.util.HashMap;
import java.util.Map;

public class _2_NumberToWord {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(100,"hundred");
        map.put(1000,"thousand");
        map.put(100000,"lakh");
        map.put(10000000,"crore");

        String[] ones={"zero","one","two","three","four","five","six","seven","eight","nine","ten"
                ,"leven","twelve","thirteen","fourteen","fifteen","sixteen",
                "seventeen","eighteen","nineteen"};
        String[] tens={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        int num=9_09_999;
        while(num/100000>0){
            int temp=num/100000;
                if(temp>19){
                    System.out.println(tens[temp/10]);
                    System.out.println(ones[temp%10]);
                }
                else {
                    System.out.println(ones[temp]);
                }
                System.out.println(map.get(100000));
            num=num%100000;
        }
        while(num>=1000){
            int temp=num;
            if(temp/1000>0){
                int rem=temp/1000;
                if(rem>19){
                    System.out.println(tens[rem/10]);
                    System.out.println(ones[rem%10]);
                }
                else {
                    System.out.println(ones[rem]);
                }
                System.out.println(map.get(1000));
            }
            num=num%1000;
        }
        //num=num%1000;
        while(num>=100){
                int temp=num/100;
                System.out.println(ones[temp]);
                System.out.println(map.get(100));
                num=num%100;
        }
       // num=num%100;
        while(num>=19){
            int temp=num/10;
            System.out.println(tens[temp]);
            num=num%10;
        }
        System.out.println(ones[num]);
    }
}
