package javaTPointPrograms._1_basciPrograms;

import java.util.stream.IntStream;

public class _9_PalindromeCheckJava8 {
    public static void main(String[] args) {
        String str="123";
        boolean isPalindrome= checkWhetherPalindromeOrNot(str);
        System.out.println(isPalindrome);
    }

    private static boolean checkWhetherPalindromeOrNot(String str) {
        String clearStr=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return  IntStream.range(0,clearStr.length()/2).
                allMatch(i->clearStr.charAt(i)==clearStr.charAt(clearStr.length()-i-1));

    }
}
