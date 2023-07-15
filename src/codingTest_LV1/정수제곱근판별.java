package codingTest_LV1;

import java.util.Scanner;

public class 정수제곱근판별 {

	public static void main(String[] args) {
		/*
		 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다. n이 양의 정수 x의 
		 * 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
		 */
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long answer = -1;
		
		// 1. for문반복
		for(long i = 1; i <= n; i++) {
			if((int)Math.sqrt(n)==i) {
				answer = (i+1)*(i+1);
//				answer = (int)Math.sqrt(i+1);
				break; 
			}
		} // 시간초과 오류 발생. 큰 숫자가 들어오면 반복문의 반복시간이 길어지므로 다른 방법 필요 > break 구문으로 해결
		/*
		 *         
		long answer = -1;
        Double sqrt = Math.sqrt(n);
      
        if(sqrt == sqrt.intValue()){
            answer =  (long)Math.pow(sqrt + 1, 2);
        }
		 */
		System.out.println(answer);

	}

}
