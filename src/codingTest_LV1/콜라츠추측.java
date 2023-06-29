package codingTest_LV1;

import java.util.Scanner;

public class 콜라츠추측 {

	public static void main(String[] args) {
		/*
		 * 예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다. 
		 * 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요. 단, 주어진 수가 1인 경우에는 0을, 
		 * 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int answer = 0;
		for(int i = num; i > 0;) {
			if(num%2==0) {
	            num = num/2;
	            answer++;
	            System.out.println("짝수 " + num);
		    } else {
		        num = num*3+1;
		        answer++;
		        System.out.println("홀수 " + num);
		    }
			System.out.println(i);
		    if(answer>=500) {
		        answer = -1;
		        break;
		    }
		}
		System.out.println(answer);
	}

}
