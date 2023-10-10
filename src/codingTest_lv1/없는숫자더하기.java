package codingTest_lv1;

import java.util.HashSet;

public class 없는숫자더하기 {

	public static void main(String[] args) {
		/*
		 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 
		 * 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
		 */
		int[] numbers = {5,8,4,0,6,7,9};
		int answer = 0;
		HashSet<Integer> numberSet = new HashSet<Integer>();
		
		// numbers 배열 숫자를 HashSet에 추가
		for(int num : numbers) {
			numberSet.add(num);
		}
		
		// contains 메서드를 통해, 0 ~ 9까지 반복문에서 없는 숫자 확인하고 더하기
		for(int i = 0; i <= 9; i++) {
			if(!numberSet.contains(i)) {
				answer += i;
			}
		}
		System.out.println(answer);
	}

}
