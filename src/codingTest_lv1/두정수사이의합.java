package codingTest_lv1;

import java.util.Scanner;

public class 두정수사이의합 {

	public static void main(String[] args) {
		/* 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
		예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
		*/
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		long answer = 0;
        if(a > b) {
            for(int i = b; i <= a; i++) {
                answer += i;
            }
        } else if(a < b) {
            for(int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            answer = a;
        }
        System.out.println(answer);
	}

}
