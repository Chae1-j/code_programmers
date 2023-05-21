package codingTest_lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		/*
		 * array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 
		 * 작성해주세요. divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
		 */
		int[] arr = {1,53,22,76,32};
		int divisor = 2;
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]%divisor==0) {
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        if(list.size()==0) {
            answer = new int[] {-1};
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
	}

}
