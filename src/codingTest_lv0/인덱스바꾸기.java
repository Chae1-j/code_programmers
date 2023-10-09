package codingTest_lv0;

import java.util.Scanner;

public class 인덱스바꾸기 {

	public static void main(String[] args) {
		/*
		 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서 인덱스 num1과 
		 * 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		String answer = "";
		String[] str = my_string.split("");
		String tmp = ""; // char 는 공백으로 초기화.
		tmp = str[num1]; 
		str[num1] = str[num2];
		str[num2] = tmp;
		for(int i = 0; i < str.length; i++) {
			answer += str[i];
		}
		System.out.println(answer);
	}

}
