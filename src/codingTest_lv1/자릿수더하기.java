package codingTest_lv1;

public class 자릿수더하기 {

	public static void main(String[] args) {
		/*
		 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
		 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
		 */
		int n = 333214321;
		int answer = 0;
        String[] arr = Integer.toString(n).split("");
        for(int i = 0; i < arr.length; i++) {
            answer += Integer.parseInt(arr[i]);
        }
        System.out.println(answer);
	}

}
