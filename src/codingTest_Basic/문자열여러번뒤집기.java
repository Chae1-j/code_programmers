package codingTest_Basic;

import java.util.Scanner;

public class 문자열여러번뒤집기 {

	public static void main(String[] args) {
		/*
		 * 문자열 my_string과 이차원 정수 배열 queries가 매개변수로 주어집니다. queries의 원소는 
		 * [s, e] 형태로, my_string의 인덱스 s부터 인덱스 e까지를 뒤집으라는 의미입니다. my_string에
		 *  queries의 명령을 순서대로 처리한 후의 문자열을 return 하는 solution 함수를 작성해 주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		int[][] queries = {{}};
		String answer = "";
        char[] ch = my_string.toCharArray();

	    for(int[] arr : queries){
	        for(int i=arr[0], j=arr[1]; i<j; i++, j--){
	            char tmp = ch[i];
		        ch[i] = ch[j];
		        ch[j] = tmp;
	        }
	    }
	    for(int i=0; i<ch.length; i++){
	        answer += ch[i];
	    }
	}
}
