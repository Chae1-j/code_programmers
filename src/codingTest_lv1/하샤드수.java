package codingTest_lv1;

import java.util.Arrays;
import java.util.Scanner;

public class 하샤드수 {

	public static void main(String[] args) {
		/*
		 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 
		 * 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다. 자연수 x를 입력받아 x가 하샤드 
		 * 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean answer = true;
		String[] xArr = Integer.toString(x).split("");
//		System.out.println(xStr + "?");
//		int hab = 1;
//		if(xStr.length() > 1) {
//			for(int i = 0; i < xStr.length(); i++) {
//				System.out.println(Integer.valueOf(xStr.charAt(i)));
//				hab += Integer.valueOf(xStr.charAt(i));
//			}
//		}
//		System.out.println("합 : " + hab);
//		if(x%hab > 0) {
//			answer = false;
//		
//		System.out.println(Arrays.toString(xArr) + "문자열 변환값");
		int hab = 0;
		for(int i = 0; i < xArr.length; i++) {
			hab += Integer.valueOf(xArr[i]);
		}
		
		if(xArr.length >= 2) {
			if(x%hab!=0) {
				answer = false;
			}
		}
		System.out.println(answer);
	}

}
