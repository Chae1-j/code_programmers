package codingTest_lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 두개뽑아서더하기 {

	public static void main(String[] args) {
		/*
		 * 정수 배열 numbers가 주어집니다. numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 
		 * 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.
		 */
		int[] numbers = {0,0,0,4,3,2,1,1};
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < numbers.length-1;i++) {
			for(int j = i + 1; j < numbers.length; j++) {
				if(!list.contains(numbers[i]+numbers[j])) {
					list.add(numbers[i]+numbers[j]);
				}
			}
		}
		
		answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		Arrays.sort(answer);
		System.out.println(Arrays.toString(answer));
	}

}
