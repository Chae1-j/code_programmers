package codingTest_Intro;

import java.util.*;

public class 중복된문자제거 {

	public static void main(String[] args) {
		/*
		 * 문자열 my_string이 매개변수로 주어집니다. my_string에서 중복된 문자를 제거하고 하나의 
		 * 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String answer = "";
		for(int i = 0; i < my_string.length(); i++) {
			if(my_string.indexOf(my_string.charAt(i))==i) {
				answer += my_string.charAt(i);
			}
		}
		System.out.println(answer);
//		StringBuilder sb = new StringBuilder();
//		Set<Character> set = new HashSet<>();
//		for(char c : my_string.toCharArray()) {
//			if(set.add(c)) {
//				sb.append(c);
//			}
//		}
//		System.out.println(sb.toString());
		
//		String[] sArr = my_string.split("");
//		System.out.println(Arrays.toString(sArr));
	}

}
