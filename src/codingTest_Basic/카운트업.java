package codingTest_Basic;

import java.util.Arrays;
import java.util.Scanner;

public class 카운트업 {

	public static void main(String[] args) {
		/*
		 * 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 
		 * return하도록 solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int start_num = sc.nextInt();
		int end_num = sc.nextInt();
		int[] answer = new int[end_num-start_num+1];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = start_num + i;
		}
		
		System.out.println(Arrays.toString(answer));
	}

}
