package codingTest_Basic;

import java.util.Scanner;

public class L로만들기 {

	public static void main(String[] args) {
		/*
		 * 알파벳 소문자로 이루어진 문자열 myString이 주어집니다. 알파벳 순서에서 "l"보다 앞서는 모든 문자를 "l"로
		 * 바꾼 문자열을 return 하는 solution 함수를 완성해 주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String myString = sc.next();
		String answer = "";
        char ch = ' ';
        String str = "";
        for(int i = 0; i < myString.length();i++) {
            ch = myString.charAt(i);
            str = Character.toString(ch);
            if(ch + 0 < 108) {
                str = str.replace(myString.charAt(i),'l');
            }
            answer += str;
        }
        System.out.println(answer);
	}

}
