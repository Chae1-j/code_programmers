package codingTest_lv1;

import java.util.Scanner;

public class X만큼_간격이_있는_n개의_숫자 {

	public static void main(String[] args) {
		/*
		 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 
		 * 리턴해야 합니다. 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
		 * x는 -10000000 이상, 10000000 이하인 정수입니다.
		 * n은 1000 이하인 자연수입니다.
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		long[] answer = new long[n];
        answer[0] = x;
        for(int i = 1; i < answer.length; i++) {
            answer[i] = answer[i-1] + x; 
        }
	}

}
