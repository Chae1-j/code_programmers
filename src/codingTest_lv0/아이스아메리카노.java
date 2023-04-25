package codingTest_lv0;

import java.util.Arrays;
import java.util.Scanner;

public class 아이스아메리카노 {

	public static void main(String[] args) {
		/*
		 * 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다. 머쓱이가 가지고 
		 * 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와 남는 돈을 순서대로 
		 * 담은 배열을 return 하도록 solution 함수를 완성해보세요.
		 */
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int[] answer = new int[2];
        int a = money/5500;
        int b = money-5500*a;
        
        answer[0] = a;
        answer[1] = b;
        System.out.println(Arrays.toString(answer));
	}

}
