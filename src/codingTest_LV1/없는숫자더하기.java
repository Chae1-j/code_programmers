package codingTest_LV1;

import java.util.Arrays;

public class 없는숫자더하기 {

	public static void main(String[] args) {
		/*
		 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 
		 * 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
		 */
		int[] numbers = {5,8,4,0,6,7,9};
		int answer = -1;
//		Arrays.sort(numbers);
//		for(int i = 0; i < numbers.length; i++) {
//            if(numbers[i]!=i) {
//                answer += i;
//            }
//		}
		int sum = 0; 
		int total = 0;
		for(int i = 0; i<10; i++) {
			sum+=i;
		}
        
        for(int i = 0; i<numbers.length; i++) {
			total += numbers[i];
		}
            answer = sum - total;
		System.out.println(answer);
	}

}
