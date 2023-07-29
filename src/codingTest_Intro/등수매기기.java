package codingTest_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class 등수매기기 {

	public static void main(String[] args) {
		/*
		 * 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 영어 점수와 수학 점수를 담은 2차원 
		 * 정수 배열 score가 주어질 때, 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 
		 * solution 함수를 완성해주세요.
		 */
		int[][] score = {{80,70},
						 {90,50},
						 {40,70},
						 {50,80}};
		int[] answer = new int[score.length];
		ArrayList<Integer> list = new ArrayList();
		for(int i=0; i < score.length;i++) {
			list.add((score[i][0]+score[i][1])/2);
		}
		for(int i = 0; i < list.size(); i++) {
			answer[i]=1;
			for(int j = 0; j <list.size(); j++) {
				if(list.get(i) <list.get(j)) answer[i]++;
			}
		} 
		// 테스트 케이스 3번 6번 실패, 소수점고
		System.out.println(list);
		System.out.println(Arrays.toString(answer));
	}

}
