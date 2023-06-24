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
		int size = my_str.length()/n;

		if(my_str.length()%n!=0) {
			size += 1;
		}
		String[] answer = new String[size];
		for(int i = 0; i < answer.length; i++) {
			if(i==0) {
				answer[i]= my_str.substring(0, n);
			} else if(i>0 && i < size-1) {
				answer[i] = my_str.substring(n*i, (n*i)+n);
			} else {
				answer[i] = my_str.substring(n*i, my_str.length());
			}
		}
		System.out.println(size);
		//String[] answer = new String[3];
		
		//System.out.println(answer.length);
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
