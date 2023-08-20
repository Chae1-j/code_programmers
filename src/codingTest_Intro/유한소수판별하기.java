package codingTest_Intro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class 유한소수판별하기 {

	public static void main(String[] args) {
		/*
		 * 소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다. 분수를 소수로 고칠 때 유한소수로 
		 * 나타낼 수 있는 분수인지 판별하려고 합니다. 유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
		 * - 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
		 * 두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 
		 * solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int answer = 1;
		ArrayList<Integer> bj = new ArrayList<Integer>();
		ArrayList<Integer> bm = new ArrayList<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i <= a; i++)	if(a%i==0) bj.add(i);
		for(int i=1; i <= b; i++)	if(a%i==0) bm.add(i);
		
		for(int i = 0; i < bj.size(); i++) {
			for(int j = 0; j < bm.size();j++) {
				if(bj.get(i) == bm.get(j)) {
					list.add(bj.get(i));
				}
			}
		}
		if(a%list.get(list.size()-1)==0 && b%list.get(list.size()-1)==0) {
			a = a/list.get(list.size()-1);
			b = b/list.get(list.size()-1);
		} // 분자와 분모를 최대공약수로 나누기
		
		// if(b%2==0 || b%5==0) answer = 1; 분모의 약수. 2와 5만 들어있는 경우가 아닌 2와 5가 포함되어있냐는 if문
		list.removeAll(list);
		for(int i = 2; i <=b ; i++) {
			if(b%i==0) {
				list.add(i);
				b /= i;
			}
		}
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) != 2 || list.get(i) != 5) {

			}
		}
//		System.out.println("a = " + a + ", b = " + b);
		System.out.println(list);
		System.out.println(answer);
	}

}
