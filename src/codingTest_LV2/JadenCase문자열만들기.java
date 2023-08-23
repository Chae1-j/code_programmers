package codingTest_LV2;

import java.util.Arrays;

public class JadenCase문자열만들기 {

	public static void main(String[] args) {
		/*
		 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 단, 첫 문자가 알파벳이 아닐 때에는 이어지는 
		 * 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
		 * 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
		 */
		String s = "3people   unFollowed me";
		String answer = "";
		StringBuffer sb = new StringBuffer();
		String[] sArr = s.split(" ");
		for(String str : sArr) {
			if(!str.isEmpty()) {
				str = str.substring(0,1).toUpperCase() + str.substring(1,str.length()).toLowerCase();
				System.out.println("반복문 내의 str : " + str);
				sb.append(str);
				sb.append(" ");
			} // 공백이 여러개일 경우 empty 판단
		}
		answer = sb.toString().trim();
		System.out.println(answer);
	}

}
