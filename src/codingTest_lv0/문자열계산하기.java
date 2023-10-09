package codingTest_lv0;

import java.util.Scanner;

public class 문자열계산하기 {

	public static void main(String[] args) {
		/* my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때, 수식을 
		 * 계산한 값을 return 하는 solution 함수를 완성해주세요.
		*/
		Scanner sc = new Scanner(System.in);
		String my_string = sc.next();
		String[] sArr = my_string.split(" ");
		int answer = Integer.parseInt(sArr[0]); // 첫 번 째 숫자를 초기값으로 지정
		for(int i = 1; i < sArr.length; i+=2) {
			String str = sArr[i];
			int num = Integer.parseInt(sArr[i+1]);
			
			if(str.equals("+")) {
				answer += num;
			} else if(str.equals("-")) {
				answer -= num;
			}
		}
//		for(int i = 0; i < sArr.length; i++) {
//			if(i%2==1 && sArr[i].equals("+")) {
//				answer = Integer.valueOf(sArr[i-1]) + Integer.valueOf(sArr[i+1]);				
//			} else if(i%2==1 && sArr[i].equals("-")) {
//				for(int j = 0; j < sArr.length; j += 2) {
//					answer -= Integer.valueOf(sArr[j]);
//				}
//			}
//		}
		System.out.println(answer);
	}

}
