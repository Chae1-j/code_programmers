package codingTest_lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 제일작은수제거하기 {

	public static void main(String[] args) {
		/*
		 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 
		 * 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, 
		 * [10]면 [-1]을 리턴 합니다.
		 */
		int[] arr = {10};
		int min = arr[0];
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		if(arr.length==1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			for(int i=0; i<arr.length;i++) {
				list.add(arr[i]);
				if(min > arr[i]) {
					min = arr[i];
				}
			}
			for(int i = 0; i < list.size(); i++) {
				if(min == list.get(i)) {
					list.remove(i);
				}
			}
			answer = new int[list.size()];
			for(int i = 0; i < answer.length; i++) {
				answer[i] = list.get(i);
			}
			
		}

		System.out.println(Arrays.toString(answer));
	}

}
