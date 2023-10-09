package codingTest_lv0;

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
		int answer = 2;
		int gcd = 1;
		
		for(int i = 1; i <= a && i <= b; i++) {
			if(a%i==0 && b%i==0) {
				gcd = i;
			}
		}
		int min = a*b/gcd;
		int i = b/gcd;
		
		while(i%2==0 || i%5 ==0) {
			if(i%2==0) i /= 2;
			if(i%5==0) i /= 5;
			if(i==1) break;
		}
		
		if(i == 1) {
			answer = 1;
		}
		
		System.out.println(answer);
	}

}
