package codingTest_Basic;

import java.util.Arrays;

public class 수열과구간쿼리2 {

	public static void main(String[] args) {
		/*
		 * 정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, 
		 * [s, e, k] 꼴입니다. 각 query마다 순서대로 s ≤ i ≤ e인 모든 i에 대해 k보다 크면서 가장 작은 arr[i]를 
		 * 찾습니다.각 쿼리의 순서에 맞게 답을 저장한 배열을 반환하는 solution 함수를 완성해 주세요. 단, 특정 쿼리의 답이
		 * 존재하지 않으면 -1을 저장합니다.
		 */
		int[] arr = {};
		int[][] queries = {{},{},{}};
		int[] answer = new int[queries.length];
		for (int i = 0; i < queries.length; i++){
			int s = queries[i][0];
			int e = queries[i][1];
			int k = queries[i][2];
			int[] arr2 = Arrays.copyOfRange(arr, s, e+1);
			Arrays.sort(arr2);
			int j = 0, count = 0;
			
	        while (j < arr2.length){
	        	if (arr2[j] > k){
	        		answer[i] = arr2[j];
	        		count++;
	        		break;
                }
	                j++;
            }

	        if (count == 0){
                answer[i] = -1;
            }
        }
		System.out.println(Arrays.toString(answer));
	}
}
