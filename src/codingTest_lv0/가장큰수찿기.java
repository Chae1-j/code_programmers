package codingTest_lv0;

import java.util.Arrays;

public class 가장큰수찿기 {

	public static void main(String[] args) {
		/*
		 * 정수 배열 array가 매개변수로 주어질 때, 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 
		 * solution 함수를 완성해보세요.
		 */
		int[] array = {2,9,12,4,7,56,22};
		int[] answer = new int[2];
		int max = array[0];
		for(int i = 0; i < array.length; i++) {
			if(max < array[i]) {
				max = array[i];
				answer[1] = i;
			}
		}
		answer[0] = max;
		
		System.out.println(Arrays.toString(answer));
	}

}
