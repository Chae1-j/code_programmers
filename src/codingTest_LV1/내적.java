package codingTest_LV1;

public class 내적 {

	public static void main(String[] args) {
		/*
		 * 길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.
		 * 이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이)
		 */
		int[] a = {1,2,3,4,};
		int[] b = {-3,-1,0,2};
		int answer = 0; // 문제제시에서 'int answer = 123456789;'으로 되어있음.

        for(int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        System.out.println(answer);
	}

}
