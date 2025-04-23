package javaTPointPrograms.numberPrograms;

import java.util.HashMap;
import java.util.Map;

public class _2_NumberToWord {
    public static void main(String[] args) {
       _2_NumberToWord.printNumberInWords(9999);

    }

    private static void printNumberInWords(int num) {
        Map<Integer,String> map=new HashMap<>();
        map.put(100,"hundred");
        map.put(1000,"thousand");
        map.put(100000,"lakh");
        map.put(10000000,"one crore");

        String[] ones={"","one","two","three","four","five","six","seven","eight","nine","ten"
                ,"eleven","twelve","thirteen","fourteen","fifteen","sixteen",
                "seventeen","eighteen","nineteen"};
        String[] tens={"","ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
        StringBuilder words=new StringBuilder();
        if (num==0){
            //System.out.println("zero");
            words.append("zero");
            return;
        }
        if(num==10000000){
            words.append(map.get(10000000));
        }
            //System.out.println(map.get(10000000));
        if(num/100000>0){
            int temp=num/100000;
            if(temp>19){
                words.append(tens[temp/10]+" "+ones[temp%10]);
               /* System.out.println(tens[temp/10]);
                System.out.println(ones[temp%10]);*/
            }
            else {
                words.append(" "+ones[temp]);
               // System.out.println(ones[temp]);
            }
            words.append(" "+map.get(100000));
           // System.out.println(map.get(100000));
            num=num%100000;
        }
        if (num/1000>0){
            int rem=num/1000;
            if(rem>19){
                words.append(" "+tens[rem/10]);
                words.append(" "+ones[rem%10]);
//                System.out.println(tens[rem/10]);
//                System.out.println(ones[rem%10]);
            }
            else {
                words.append(" "+ones[rem]);
               // System.out.println(ones[rem]);
            }
            words.append(" "+map.get(1000));
            //System.out.println(map.get(1000));

            num=num%1000;
        }
        //num=num%1000;
        if (num/100>0){
            int temp=num/100;
            words.append(" "+ones[temp]);
//            System.out.println(ones[temp]);
//            System.out.println(map.get(100));
            words.append(" "+map.get(100));
            num=num%100;
        }
        // num=num%100;
        if (num>19){
            int temp=num/10;
            words.append(" "+tens[temp]);
            //System.out.println(tens[temp]);
            num=num%10;
            if(num>0)
                words.append(" "+ones[num]);
               // System.out.println(ones[num]);
        } else {
            //System.out.println(ones[num]);
            words.append(" "+ones[num]);
        }
        System.out.println(words.toString().trim());
    }


}
