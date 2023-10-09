package codingTest_lv0;

import java.util.Scanner;

public class 합성수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		int cnt = 0;
        for(int i = 1; i <= n; i++) {
        	cnt = 0; // cnt 를 다시 0으로 선언.
            for(int j = 1; j <= i; j++) {
                if(i%j==0) {
                    cnt++;
                }
            }
            if(cnt >= 3) {
            	answer++;
            }
        } 
        System.out.println(answer);
	}

}
