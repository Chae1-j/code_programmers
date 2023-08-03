package codingTest_LV1;

import java.util.Scanner;

public class 콜라츠추측 {

	public static void main(String[] args) {
		/*
		 * 예를 들어, 주어진 수가 6이라면 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 이 되어 총 8번 만에 1이 됩니다. 
		 * 위 작업을 몇 번이나 반복해야 하는지 반환하는 함수, solution을 완성해 주세요. 단, 주어진 수가 1인 경우에는 0을, 
		 * 작업을 500번 반복할 때까지 1이 되지 않는다면 –1을 반환해 주세요.
		 */
		
		// 테스트케이스 626331실행시 원하는 값 나오지 않음 int > long으로 변경
		// 626331 > answer : 7
		Scanner sc = new Scanner(System.in);
		Long num = sc.nextLong();
		int answer = 0;
		int i = 0;
//		Long lNum = (long)num;
//		while(i < 500) {
//			if(num%2==0) {
//	            lNum = lNum/2;
//	            answer++;
////	            System.out.println("짝수 " + num);
//		    } else {
//		        lNum = lNum*3+1;
//		        answer++;
////		        System.out.println("홀수 " + num);
//		    }
//		
//		    if(answer>=500) {
//		        answer = -1;
//		    }
//			if(num == 1) {
//				break;
//			}
//		}
	        
        while(num != 1) {
            if(num % 2 == 0)  num /= 2;
            else num = num * 3 + 1; // 다음 실행문장이 하나일 땐 중괄호 생략 가능. 단 다음 한 문장만 실행됨을 유의!
            answer++;
            if(answer >= 500) {
                answer = -1;
                break;
            }
        }
        System.out.println(answer);
	}

}
