package javaTPointPrograms.basciPrograms;

import java.util.stream.IntStream;

public class _4_FindMaxLengthOfStringsInArray {
    public static void main(String[] args) {
        String[] strings={"Apple","Banana","Avocado","Apricot","Grapes"};

        final int[] max_length = {-1};
        final int[] index = {-1};

        IntStream.range(0,strings.length-1).forEach(i->{

            if(strings[i].length()> max_length[0]){
                max_length[0] =-1;
                max_length[0] =strings[i].length();
                index[0] =i;
            }

        });


        if (index[0] != -1) {
            System.out.println("Longest string is: " + strings[index[0]]);
        } else {
            System.out.println("No strings found.");
        }
    }
}
