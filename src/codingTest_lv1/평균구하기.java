package codingTest_lv1;

public class 평균구하기 {

	public static void main(String[] args) {
		/*
		 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
		 */
		int[] arr = {4,2,7,11,89};
		double answer = 0;
		double sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
        }
		answer = sum/arr.length;
		System.out.println(answer);
	}

}
