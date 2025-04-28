package javaTPointPrograms._2_numberPrograms;

public class _15_SqrtWithoutUsingSQRT {
    public static void main(String[] args) {
        int num=625;
        double sqrt=num/2.0;
        while (Math.abs(sqrt * sqrt - num) > 0.0001) {
            sqrt = (sqrt + num / sqrt) / 2;
        }
        System.out.println((int)sqrt);
    }
}
