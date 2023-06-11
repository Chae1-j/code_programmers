package codingTest_Intro;

import java.util.Arrays;
import java.util.Scanner;

public class 문자열정렬하기_2 {

	public static void main(String[] args) {
		/*
		 * 영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때, my_string을 모두 소문자로 바꾸고 
		 * 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String answer = "";
		my_string = my_string.toLowerCase();
		String[] arr = my_string.split("");
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++) {
			answer += arr[i];
		}
		System.out.println(answer);
	}

}
