package codingTest_lv1;

import java.util.Scanner;

public class 가운데글자가져오기 {

	public static void main(String[] args) {
		/*
		 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를
		 * 반환하면 됩니다.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String answer = "";
		String[] str = s.split("");
		if(str.length%2==1) {
			answer = str[str.length/2];
		} else {
			answer = str[str.length/2-1] + str[str.length/2];
		}
//		System.out.println(str[str.length/2]);
		System.out.println(answer = str[str.length/2-1] + str[str.length/2]);
		System.out.println(answer);
	}

}
