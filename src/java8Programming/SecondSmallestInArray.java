package java8Programming;

import java.util.Arrays;

public class SecondSmallestInArray {

	public static void main(String[] args) {
		//int[] arr= {5,2,8,3,1,1,1,1};
		
		int[] arr= {1};
		int num=Arrays.stream(arr).distinct().skip(1).limit(1).findFirst().
				orElseThrow(() -> new IllegalArgumentException("no second smallest"));
		System.out.println("second smallest"+num);

	}

}
