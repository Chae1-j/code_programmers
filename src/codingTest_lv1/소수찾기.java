package codingTest_lv1;

import java.util.Scanner;

public class 소수찾기 {

	public static void main(String[] args) {
		/* 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
		 * - 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다. (1은 소수가 아닙니다.)
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		int[] nums = new int[n+1];
        
        for(int i = 0; i < n+1; i++) nums[i] = i;
        
        for(int i = 2; i < n+1; i++) {
            if(nums[i] != 0) {
                for(int j=i+i; j<n+1; j+=i) {
                    nums[j] = 0;
                }
            }
        }
        
        for(int i = 2; i < n+1; i++) {
            if(nums[i] != 0) answer++;
        }
		System.out.println(answer);
	}

}
