package codingTest_lv0;

import java.util.Scanner;

public class 숨어있는숫자의덧셈_2 {

	public static void main(String[] args) {
		/*문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 
		 * 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
		*/
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		int answer = 0;
		StringBuilder sb = new StringBuilder();
		
		for(char ch : my_string.toCharArray()) { // 문자열을 한글자씩 반복 접근하여 자연수 추
			if(Character.isDigit(ch)) { // isDigit으로 자연수인지 판별하여 자연수일 경우 뉴에 추기
				sb.append(ch);
			} else {
				if(sb.length() > 0) { // 자연수가 저장되어 있는지 판별
					answer += Integer.valueOf(sb.toString());
					sb.setLength(0); //sb를 다시 비워줌
				}
			}
			
			if(sb.length() > 0) {
				answer += Integer.valueOf(sb.toString());
			}
		}
		System.out.println(answer);
	}

}
