package javaTPointPrograms;

public class _11_ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int armstrongNumber=armstrongNumber(num);
        System.out.println(num==armstrongNumber);
    }

    private static int armstrongNumber(int num) {
        String numstr=String.valueOf(num);
        int pow=numstr.length();

        return numstr.chars().map(Character::getNumericValue).
                map(i->(int)Math.pow(i,pow)).sum();

    }
}
