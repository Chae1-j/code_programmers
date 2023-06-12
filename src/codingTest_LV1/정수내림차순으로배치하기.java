package codingTest_LV1;

import java.util.Arrays;
import java.util.Scanner;

public class 정수내림차순으로배치하기 {

	public static void main(String[] args) {
		/*함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 
		 * 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
		 */
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long answer = 0;
		String[] nArr = Long.toString(n).split("");
		String str = "";
		Arrays.sort(nArr);
		for(int i = 0; i < nArr.length; i++) {
			str += nArr[nArr.length-1-i];
		}
		answer = Long.parseLong(str);
		System.out.println(answer);
	}

}
