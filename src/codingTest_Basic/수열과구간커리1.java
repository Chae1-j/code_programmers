package codingTest_Basic;

import java.util.Arrays;

public class 수열과구간커리1 {

	public static void main(String[] args) {
		/*
		 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 
		 * 나타내며, [s, e] 꼴입니다. 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 arr[i]에 1을 더합니다.
		 * 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.
		 */
		int[] arr = {};
		int[][] queries = {{}};
		int[] answer = new int[arr.length];
        for(int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            for(int j = s; j <= e; j++) {
                arr[j] += 1;
            }
        }
        for(int i = 0; i < answer.length; i++) {
            answer[i] = arr[i];
        }
        System.out.println(Arrays.toString(answer));
	}

}
