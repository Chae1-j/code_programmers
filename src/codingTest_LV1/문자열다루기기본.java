package codingTest_LV1;

import java.util.Scanner;

public class 문자열다루기기본 {

	public static void main(String[] args) {
		/*
		 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 예를 들어 s가 
		 * "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		boolean answer = true;
		if(s.length() == 4 || s.length() == 6) {
			for(int i = 0; i < s.length(); i++) {
				if((s.charAt(i) + 0 >= 65 && s.charAt(i) + 0 <= 90) || (s.charAt(i) + 0  >= 97) && (s.charAt(i) + 0  >= 97 && s.charAt(i) + 0 <= 122)) answer = false;
			}
		} else answer = false;
		System.out.println(answer);
	}

}
