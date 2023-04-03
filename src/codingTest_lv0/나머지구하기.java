package codingTest_lv0;

import java.util.Scanner;

public class 나머지구하기 {

	public static void main(String[] args) {
		/*
		 * 정수 num1, num2가 매개변수로 주어질 때, num1를 num2로 나눈 나머지를 return 하도록 solution 함수를 
		 * 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int answer = num1%num2;
		System.out.println(answer);
	}

}
