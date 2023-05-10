package codingTest_Basic;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열의원소만큼추가하기 {
	
	public static void main(String[] args) {
		/*
		 * 아무 원소도 들어있지 않은 빈 배열 X가 있습니다. 양의 정수 배열 arr가 매개변수로 주어질 때, arr의 
		 * 앞에서부터 차례대로 원소를 보면서 원소가 a라면 X의 맨 뒤에 a를 a번 추가하는 일을 반복한 뒤의 배열 X를 
		 * return 하는 solution 함수를 작성해 주세요.
		 */
		int[] arr = {};
		int[] answer = {};
        int len = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            len += arr[i];
            for(int j = 0; j < arr[i]; j++) {
                list.add(arr[i]);
            }
        }
        answer = new int[len];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        System.out.println(Arrays.toString(answer));
	}
}
