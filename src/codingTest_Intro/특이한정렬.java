package codingTest_Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 특이한정렬 {

	public static void main(String[] args) {
		/*
		 * 정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다. 이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 
		 * 오도록 배치합니다. 정수가 담긴 배열 numlist와 정수 n이 주어질 때 numlist의 원소를 n으로부터 가까운 
		 * 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
		 */
		int[] numlist = {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] answer = new int[numlist.length];
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < numlist.length; i++) {
//			if(numlist[i]==n) list.add(numlist[i]);
			list.add(Math.abs(n-numlist[i]));
			for(int j = 0; j < list.size(); j++) {
				if(list.get(i) <list.get(j)) answer[i]++;
			}
			System.out.println(list);
		}
		System.out.println(Arrays.toString(answer));
	}

}
