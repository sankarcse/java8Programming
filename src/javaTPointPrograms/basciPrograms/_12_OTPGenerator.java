package javaTPointPrograms.basciPrograms;

import java.util.Random;

public class _12_OTPGenerator {
    public static void main(String[] args) {
        int otp=getOTPOf6Digit();
        System.out.println(otp);
    }

    private static int getOTPOf6Digit() {
      return new Random().nextInt(100000,999999);
    }
}
