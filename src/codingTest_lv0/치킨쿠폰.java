package codingTest_lv0;

import java.util.Scanner;

public class 치킨쿠폰 {
	public static void main(String[] args) {
		/*
		 * 프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다. 쿠폰을 열 장 모으면 치킨을 한 마리
		 * 서비스로 받을 수 있고, 서비스 치킨에도 쿠폰이 발급됩니다. 시켜먹은 치킨의 수 chicken이 매개변수로 
		 * 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int chicken = sc.nextInt();
//		int answer = -1;
//		while(chicken>=10) {
//			System.out.println("치킨 마리 : " + answer);
//			int free = chicken%10;
//			answer = chicken/10 + free;
//			System.out.println("남는 쿠폰 : " + chicken);
//		}
		int coupon = chicken;
		int	answer = 0;

		while (coupon >= 10) {
			int leftCoupon = coupon % 10;
			answer += coupon / 10;
			coupon = leftCoupon + coupon / 10;
		}
		System.out.println(answer);
	}

}
