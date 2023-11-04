package codingTest_lv1;

import java.util.Arrays;
import java.util.Scanner;

public class 체육복 {

	public static void main(String[] args) {
		/*
		 * 점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 
		 * 합니다. 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 
		 * 있습니다. 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 체육복이 없으면 수업을 들을 
		 * 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다. 전체 학생의 수 n, 체육복을 도난당한 
		 * 학생들의 번호가 담긴 배열 lost, 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
		 * 체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
		 */
		int n = (new Scanner(System.in)).nextInt();
		int[] lost = {2,4}; // 도난당한 학생
		int[] reserve = {3}; // 여벌체육복을 가져온 학생
        int[] students = new int[n];
        
        // 학생 배열 초기화
        for (int i = 0; i < n; i++) {
            students[i] = 1; // 모든 학생은 체육복을 하나 가지고 있다고 가정
        }
        
        // 도난당한 학생 표시
        for (int l : lost) {
            students[l - 1]--; // 도난당한 학생은 체육복을 하나 잃음
        }
        
        // 여벌의 체육복 가져온 학생 표시
        for (int r : reserve) {
            students[r - 1]++; // 여벌의 체육복을 가져온 학생은 체육복을 하나 더 가짐
        }
        
        // 체육복 빌려주기
        for (int i = 0; i < n; i++) {
            if (students[i] == 0) {
                // 도난당한 학생인 경우
                if (i > 0 && students[i - 1] == 2) {
                    // 바로 앞 번호 학생이 여벌의 체육복을 가지고 있는 경우
                    students[i]++;
                    students[i - 1]--;
                } else if (i < n - 1 && students[i + 1] == 2) {
                    // 바로 뒷 번호 학생이 여벌의 체육복을 가지고 있는 경우
                    students[i]++;
                    students[i + 1]--;
                }
            }
        }
        
        // 체육수업을 들을 수 있는 학생 수 세기
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (students[i] >= 1) {
                answer++;
            }
        }
        System.out.println(answer);

		
/*        Arrays.sort(lost);
        Arrays.sort(reserve);
        //각 배열에서 겹치는 숫자 0으로 변경
        for (int i = 0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if (lost[i] == reserve[j]){
                    lost[i] = 0;
                    reserve[j] = 0;
                }
            }
        }
        //
        for (int i =0; i<lost.length; i++){
            for(int j = 0; j<reserve.length; j++){
                if ((lost[i] == reserve[j] || lost[i] == reserve[j]-1 || lost[i] == reserve[j]+1)&& lost[i] !=0){
                    lost[i] = 0;
                    reserve[j] = 0;
                }
            }
        }
        for (int i =0; i<lost.length; i++){
            if (lost[i] != 0) {
            	answer++;
            }
        }
        answer = n-answer;
           
		System.out.println(answer); */
	}
}
