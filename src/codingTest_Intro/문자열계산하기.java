package codingTest_Intro;

import java.util.Scanner;

public class 문자열계산하기 {

	public static void main(String[] args) {
		/* my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 
		 * 계산한 값을 return 하는 solution 함수를 완성해주세요.
		*/
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		int answer = 0;
		String[] sArr = my_string.split(" ");
		if(sArr[1].equals("+")) {
			answer = Integer.valueOf(sArr[0]) + Integer.valueOf(sArr[2]);
		} else {
			answer = Integer.valueOf(sArr[0]) - Integer.valueOf(sArr[2]);
		}

		System.out.println(answer);
	}

}
