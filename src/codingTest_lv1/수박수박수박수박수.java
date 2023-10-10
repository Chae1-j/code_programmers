package codingTest_lv1;

import java.util.Scanner;

public class 수박수박수박수박수 {

	public static void main(String[] args) {
		/*
		 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
		 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String answer = "";
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= n/2; i++) {
			sb.append("수박");
		}
		if(n%2==1) {
			sb.append("수");
		}
		answer = new String(sb);
		System.out.println(answer);
	}

}
