package codingTest_Basic;

import java.util.Scanner;

public class 문자열겹쳐쓰기 {

	public static void main(String[] args) {
		/*
		 * 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터 
		 * overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 
		 * 함수를 작성해 주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String my_string = sc.nextLine();
		String overwrite_string = sc.nextLine();
		int s = sc.nextInt();
		String answer = my_string.substring(0,s) + overwrite_string + 
				my_string.substring(s+overwrite_string.length());
		System.out.println(answer);
	}

}
