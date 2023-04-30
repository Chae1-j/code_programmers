package codingTest_Basic;

import java.util.Arrays;

public class 배열조각하기 {

	public static void main(String[] args) {
		/*
		 * 정수 배열 arr와 query가 주어집니다. query를 순회하면서 다음 작업을 반복합니다.
		 * 	- 짝수 인덱스에서는 arr에서 query[i]번 인덱스를 제외하고 배열의 query[i]번 인덱스 뒷부분을 잘라서 버립니다.
		 * 	- 홀수 인덱스에서는 arr에서 query[i]번 인덱스는 제외하고 배열의 query[i]번 인덱스 앞부분을 잘라서 버립니다.
		 * 위 작업을 마친 후 남은 arr의 부분 배열을 return 하는 solution 함수를 완성해 주세요.
		 */
		int[] arr = {};
		int[] query = {};
		int[] answer = {};
		for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                if(i == 0) {
                  answer = Arrays.copyOfRange(arr,0,query[i]+1);  
                } else {
                  answer = Arrays.copyOfRange(answer,0,query[i]+1);
                }
            } else {
                answer = Arrays.copyOfRange(answer,query[i],answer.length); 
            }
        }
		System.out.println(Arrays.toString(answer));
	}

}
