package codingTest_lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 최대공약수와최소공배수 {

	public static void main(String[] args) {
		/*
		 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 배열의 맨 앞에 최대공약수, 그다음 
		 * 최소공배수를 넣어 반환하면 됩니다. 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 
		 * 반환해야 합니다.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
//		ArrayList<Integer> list1 = new ArrayList<Integer>();		
//		ArrayList<Integer> list2 = new ArrayList<Integer>();
//		
//		int[] answer = new int[2];
//		for(int i = 1; i <= n; i++) {
//			if(n%i==0) list1.add(i);
//		}
//		for(int i = 1; i <= m; i++) {
//			if(m%i==0) list2.add(i);
//		}
//		for(int i = 0; i < list1.size(); i++) {
//			for(int j = 0; j < list2.size();j++) {
//				if(list1.get(i)==list2.get(j)) answer[0] = list1.get(i); 
//			}
//		}
//		if(m%n==0) {
//			answer[1] = m;
//		} else {
//			answer[1] = n*m;
//		}
//		System.out.println(Arrays.toString(answer));
//	}
		int[] answer = {0,0};
        answer[0]=gcd(Math.max(n,m), Math.min(n,m)); // 최대공약수
        answer[1]=(n*m)/answer[0]; // 최소공배수
        System.out.println(answer);
	}
	public static int gcd(int a, int b){
		if(b==0) return a;
		return gcd(b,a%b);
	} //유클리드 호제법  
}

