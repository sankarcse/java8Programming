package javaTPointPrograms._2_numberPrograms;

public class _14_SwapWithoutUsingSwap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println(a+","+b);
    }
}
