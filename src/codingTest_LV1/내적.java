package codingTest_LV1;

public class 내적 {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,};
		int[] b = {-3,-1,0,2};
		int answer = 0; // 문제제시에서 'int answer = 123456789;'으로 되어있음.

        for(int i = 0; i < a.length; i++) {
            answer += a[i]*b[i];
        }
        System.out.println(answer);
	}

}
