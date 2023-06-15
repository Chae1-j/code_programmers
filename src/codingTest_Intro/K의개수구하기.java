package codingTest_Intro;

import java.util.Scanner;

public class K의개수구하기 {

	public static void main(String[] args) {
		/*
		 * 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 정수 i, j, k가 
		 * 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 
		 * 완성해주세요.
		 */
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		int k = sc.nextInt();
		
		int answer = 0;
        for(int a = i; a <= j; a++) {
            if(Integer.toString(a).contains(Integer.toString(k))) {
                answer++;
            }
        }
	}

}
