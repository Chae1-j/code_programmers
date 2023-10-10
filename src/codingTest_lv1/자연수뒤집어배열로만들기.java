package codingTest_lv1;

import java.util.Arrays;
import java.util.Scanner;

public class 자연수뒤집어배열로만들기 {

	public static void main(String[] args) {
		/*
		 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 
		 * [5,4,3,2,1]을 리턴합니다.
		 */
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		String[] nStr = Long.toString(n).split("");
		int[] answer = new int[nStr.length];
		
		for(int i = 0; i < nStr.length; i++) {
			answer[i] = Integer.parseInt(nStr[nStr.length-1-i]);
		}
		System.out.println(Arrays.toString(answer));
	}

}
