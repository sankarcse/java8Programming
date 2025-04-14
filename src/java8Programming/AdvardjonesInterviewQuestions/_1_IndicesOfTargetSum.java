//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package java8Programming.AdvardjonesInterviewQuestions;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class _1_IndicesOfTargetSum {
    public _1_IndicesOfTargetSum() {
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{2, 7, 5, 11, 4, -2};
        int target = 9;
        Map<Integer, Integer> map = new HashMap();
        IntStream.range(0, nums.length).forEach((i) -> {
            int complement = target - nums[i];
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                PrintStream var10000 = System.out;
                Object var10001 = map.get(complement);
                var10000.println("" + var10001 + "," + i);
            }

        });
    }
}
