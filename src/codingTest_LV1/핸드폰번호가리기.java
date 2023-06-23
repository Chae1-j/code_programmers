package codingTest_LV1;

import java.util.Scanner;

public class 핸드폰번호가리기 {

	public static void main(String[] args) {
		/*
		 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
		 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 
		 * 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String phone_number = sc.next();
		String str1 = phone_number.substring(0,phone_number.length()-4);
		String str2 = phone_number.substring(phone_number.length()-4,phone_number.length());
		for(int i = 0; i < str1.length(); i++) {
			str1.replace(str1.charAt(i), '*');
		}
 		String answer = str1 + str2;
		System.out.println(answer);
	}

}
