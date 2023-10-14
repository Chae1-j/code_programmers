package codingTest_lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class 기사단원의무기 {

	public static void main(String[] args) {
		/*
		 * 각 기사는 자신의 기사 번호의 약수 개수에 해당하는 공격력을 가진 무기를 구매하려 합니다. 단, 이웃나라와의 협약에 
		 * 의해 공격력의 제한수치를 정하고, 제한수치보다 큰 공격력을 가진 무기를 구매해야 하는 기사는 협약기관에서 정한 
		 * 공격력을 가지는 무기를 구매해야 합니다.예를 들어, 15번으로 지정된 기사단원은 15의 약수가 1, 3, 5, 15로 4개 
		 * 이므로, 공격력이 4인 무기를 구매합니다. 만약, 이웃나라와의 협약으로 정해진 공격력의 제한수치가 3이고 제한수치를 
		 * 초과한 기사가 사용할 무기의 공격력이 2라면, 15번으로 지정된 기사단원은 무기점에서 공격력이 2인 무기를 구매합니다. 
		 * 무기를 만들 때, 무기의 공격력 1당 1kg의 철이 필요합니다. 그래서 무기점에서 무기를 모두 만들기 위해 필요한 철의 
		 * 무게를 미리 계산하려 합니다.기사단원의 수를 나타내는 정수 number와 이웃나라와 협약으로 정해진 공격력의 
		 * 제한수치를 나타내는 정수 limit와 제한수치를 초과한 기사가 사용할 무기의 공격력을 나타내는 정수 power 주어졌을 
		 * 때, 무기점의 주인이 무기를 모두 만들기 위해 필요한 철의 무게를 return 하는 solution 함수를 완성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int limit = sc.nextInt();
		int power = sc.nextInt();
		int answer = 0;
//		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt = 0;
//		list.add(1);
		for(int i = 1; i <= number; i++) {
			cnt = 0;
			for(int j = 1; j*j <= i; j++) {
				if(j*j == i) cnt++;
				else if(i%j == 0) cnt += 2;
			}
//			list.add(cnt);
		}
		
		answer += cnt > limit ? power : cnt;
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i)<=limit) answer += list.get(i);
//			else answer += power;
//		}
//		System.out.println(list);
		System.out.println(answer);
	}

}
