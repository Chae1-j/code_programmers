package codingTest_Intro;

import java.util.Scanner;

public class 가까운수 {

	public static void main(String[] args) {
		/*
		 * 정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 
		 * return 하도록 solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = {10,11,12,5,26,7,33};
		int answer = 0;
		int close = array[0]-n; 
		if(close < 0) {
			close = -close; // 원소와 n의 차이가 음수 일 경우 양수로 변경.
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i]-n < close) {
				close = array[i] - n;
				answer = array[i];
			}
			
		}
		System.out.println(answer);
	}

}
