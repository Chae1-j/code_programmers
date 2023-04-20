package codingTest_Basic;

import java.util.Scanner;

public class 구_9로나눈나머지 {

	public static void main(String[] args) {
		/*
		 * 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 
		 * 있습니다. 이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 
		 * return 하는 solution 함수를 작성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		int answer = 0;
        int hab = 0;
        for(int i = 0; i < number.length(); i++) {
            hab += Character.getNumericValue(number.charAt(i));
        }
        answer = hab%9;
        System.out.println(hab);
	}

}
