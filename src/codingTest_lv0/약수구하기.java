package codingTest_lv0;

import java.util.*;

public class 약수구하기 {
	
	public static void main(String[] args) {
		/*
		 * 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를
		 * 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			if(n%i==0) {
				list.add(i);
			}
		}
		answer = new int[list.size()];
		for(int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		System.out.println(Arrays.toString(answer));
	}
}
