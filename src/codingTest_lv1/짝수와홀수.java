package codingTest_lv1;

import java.util.Scanner;

public class 짝수와홀수 {

	public static void main(String[] args) {
		/*
		 * 정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String answer = "";
        num = Math.abs(num);
        if(num % 2 == 0) {
            answer = "Even";
        } else {
            answer = "Odd";
        }
        System.out.println(answer);
	}

}
