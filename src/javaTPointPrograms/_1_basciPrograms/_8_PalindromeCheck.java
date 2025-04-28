package javaTPointPrograms._1_basciPrograms;

public class _8_PalindromeCheck {
    public static void main(String[] args) {
        String str="";
       boolean isPalindrome= checkWhetherPalindrome(str);
       if(isPalindrome)
       System.out.println(str+" is palindrome ");
       else
           System.out.println("is not palindrome");
    }

    private static boolean checkWhetherPalindrome(String str) {
       StringBuilder builder=new StringBuilder(str);
       String revstr=builder.reverse().toString();
       if(str.equals(revstr)){
           return true;
       }
       return false;
    }


}
