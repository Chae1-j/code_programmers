package codingTest_lv0;

import java.util.Scanner;

public class 문자열안에문자열 {

	public static void main(String[] args) {
		/*
		 * 문자열 str1, str2가 매개변수로 주어집니다. str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 
		 * 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		String str2 = sc.next();
		int answer = 0;
		if(str1.contains(str2)) {
            answer = 1;
        } else{
            answer = 2;
        }
		System.out.println(answer);
	}

}
