package codingTest_Intro;

import java.util.Scanner;

public class 영어가싫어요 {

	public static void main(String[] args) {
		/*
		 * 영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다. 문자열 numbers가 
		 * 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String numbers = sc.next();
		String newNum = 
				numbers.replace("zero","0").replace("one","1").replace("two","2").replace("three", "3")
				.replace("four","4").replace("five","5").replace("six","6").replace("seven","7")
				.replace("eight","8").replace("nine","9");
		long answer = Long.parseLong(newNum);
		System.out.println(answer);
	}

}
