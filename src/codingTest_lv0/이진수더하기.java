package codingTest_lv0;

import java.util.Scanner;

public class 이진수더하기 {

	public static void main(String[] args) {
		/*
		 * 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 두 이진수의 합을 
		 * return하도록 solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String bin1 = sc.next();
		String bin2 = sc.next();
		String answer = "";
		answer =  Integer.toBinaryString(Integer.valueOf(bin1, 2)+Integer.valueOf(bin2, 2));    
		
		System.out.println(answer);
				
	}

}
