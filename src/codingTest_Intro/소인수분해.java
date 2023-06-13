package codingTest_Intro;

import java.util.ArrayList;
import java.util.Scanner;

public class 소인수분해 {

	public static void main(String[] args) {
		/*
		 * 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 
		 * 나타낼 수 있습니다. 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 
		 * 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if(n%i==0 && i != 1) {
                while(n%i==0) { // while을 사용하면 2,3,6,7에서 6이 사라짐
                    n /= i;  
                }
                list.add(i); // while문 바깥에 써야지 중복값 안들어감
            }
        }
        
        answer = new int[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
	}

}
