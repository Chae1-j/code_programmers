package codingTest_lv1;

import java.util.Arrays;
import java.util.Scanner;

public class 이상한문자만들기 {

	public static void main(String[] args) {
		/*
		 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 각 단어의 짝수번째 
		 * 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
		 * - 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
		 * - 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
		 */
		Scanner sc = new Scanner(System.in);
		String s = "try hello world";
		String answer = "";
		int cnt = 0;
        String[] arr = s.split("");

        for(String str : arr) {
            cnt = str.contains(" ") ? 0 : cnt + 1;
            answer += cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase(); 
        }
        
        
//		String[] sStr = s.split(" ");
//		String answer = "";
//		for(int i = 0; i < sStr.length; i++) {
//			for(int j = 0; j < sStr[i].length(); j++) {
//				if(j%2==0) {
//					answer += String.valueOf(sStr[i].charAt(j)).toUpperCase();
//				} else {
//					answer += String.valueOf(sStr[i].charAt(j));
//				}
//			}
//			answer += " ";
//			System.out.println(Arrays.toString(sStr));
//		}
		System.out.println(answer);
	}

}
