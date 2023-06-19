package codingTest_Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 잘라서배열로저장하기 {

	public static void main(String[] args) {
		/*
		 * 문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 
		 * solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String my_str = sc.next();
		int n = sc.nextInt();
		String[] answer = new String[Math.(my_str.length()/n)];
		
		System.out.println(answer.length);
//		ArrayList<String> list = new ArrayList<>();
//		for(int i = 0; i < my_str.length()-n+1; i += n) {
//			list.add(my_str.substring(i, i+n));
//		}
//		answer = new String[list.size()];
//		for(int i = 0; i < answer.length; i++) {
//			answer[i] = list.get(i);
//		}
//		System.out.println(list);
		System.out.println(Arrays.toString(answer));
	}

}
