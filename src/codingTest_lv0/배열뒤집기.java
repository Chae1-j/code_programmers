package codingTest_lv0;

import java.util.Arrays;

public class 배열뒤집기 {

	public static void main(String[] args) {
		/*
		 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. num_list의 원소의 순서를 거꾸로 뒤집은 배열을 
		 * return하도록 solution 함수를 완성해주세요.
		 */
		int[] num_list = {32,66,1234,900,443};
		int[] answer = new int[num_list.length];
        for(int i = 0, j = num_list.length-1; j >= 0 ; i++, j--) {
            answer[i] = num_list[j];
        }
        System.out.println(Arrays.toString(answer));
	}

}
