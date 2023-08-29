package codingTest_Basic;

import java.util.Arrays;

public class SkillChk {

	public static void main(String[] args) {
		/*
		 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
		 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
		 * 
		 * 
		 *
		long answer = 0;
        if(a==b) {
            answer = a;
        } else if(a > b) {
            for(int i = b; i <= a; i++) {
                answer += i;
            }
        } else {
            for(int i = a; i <= b; i++) {
                answer += i;
            }
        }
        return answer;
		 */
		
		/*
		 * 2. 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 
		 * n이 118372면 873211을 리턴하면 됩니다.
		 */
		long n = 118372;
		String[] arr = Long.toString(n).split("");
		Arrays.sort(arr);
		String str = "";
        for(int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        System.out.println(Long.valueOf(str));
		System.out.println(Arrays.toString(arr));
	}

}
