package codingTest_lv1;

import java.util.ArrayList;
import java.util.Scanner;

public class 나머지가_1이_되는_수_찾기 {

	public static void main(String[] args) {
		/*
		 * 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 
		 * return 하도록 solution 함수를 완성해주세요. 답이 항상 존재함은 증명될 수 있습니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 1; i < n; i++) {
		    if(n%i==1) list.add(i);
		}
		answer = list.get(0);

	}

}
