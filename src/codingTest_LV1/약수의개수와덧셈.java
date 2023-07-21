package codingTest_LV1;

import java.util.Scanner;

public class 약수의개수와덧셈 {

	public static void main(String[] args) {
		/*
		 * 두 정수 left와 right가 매개변수로 주어집니다. left부터 right까지의 모든 수들 중에서, 약수의 개수가 
		 * 짝수인 수는 더하고, 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int left = sc.nextInt();
		int right = sc.nextInt();
		int answer = 0;
		int cnt = 0;
		for(int i = left; i <= right;i++) {
			cnt = 0;
			for(int j = 1; j <= i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt%2==0) {
				answer += cnt;
			} else {
				answer -= cnt;
			}
		}
		System.out.println(answer);
	}

}
