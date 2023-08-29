package codingTest_LV1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 삼진법뒤집기 {

	public static void main(String[] args) {
		/*
		 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 
		 * 수를 return 하도록 solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(n>0) {
			list.add(n%3);
			n /= 3;
		}
		System.out.println("list : " + list);
		Collections.reverse(list);
		System.out.println("list reverse : " + list);
		for(int i = 0; i < list.size();i++) {
			if(list.get(i)!= 0) {
				answer += (int) Math.pow(3, i) * list.get(i);
				System.out.println("3의 " + i + "제곱 : " + answer );
			}
		}
		System.out.println("answer : " + answer);
	}

}
