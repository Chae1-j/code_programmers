package codingTest_lv1;

public class 약수의합 {

	public static void main(String[] args) {
		/*
		 * 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
		 */
		int n = 10;
		int answer = 0;         
		for(int i = 1 ; i <= n; i++) {
			if(n%i == 0) {
                 answer += i;
            }
		}
	}

}
