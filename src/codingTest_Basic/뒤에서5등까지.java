package codingTest_Basic;

import java.util.Arrays;

public class 뒤에서5등까지 {

	public static void main(String[] args) {
		/*
		 * 정수로 이루어진 리스트 num_list가 주어집니다. num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 
		 * return하도록 solution 함수를 완성해주세요.
		 */
		int[] num_list = {};
		int[] answer = new int[5];
        Arrays.sort(num_list);
        for(int i = 0; i < 5;i++) {
            answer[i] = num_list[i];
        }

	}

}
